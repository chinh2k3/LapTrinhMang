/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_13_dns_server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Admin
 */
public class BaiTapIO_13_DNS_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            System.out.println("DNS SERVER is running .....");

            //Giả lập mã định danh
            String[][] dnsTable = {
                {"www.example.com", "192.168.1.100"},
                {"www.google.com", "192.168.1.32"},
                {"www.titv.vn", "31.13.65.36"}
            };
            while(true){
                //tạo và nhận packet
                byte[] reciveData = new byte[1024];
                DatagramPacket recivePacket = new DatagramPacket(reciveData,reciveData.length);
                socket.receive(recivePacket);
                
                //try vấn IP từ domainName
                String domainName = new String(recivePacket.getData(),0,recivePacket.getLength());
                domainName=domainName.trim();
                domainName = domainName.toLowerCase();
                
                
                String respone = "Not Found";
                for(String[] entry : dnsTable){
                    if(entry[0].equals(domainName)){
                        respone = entry[1];
                        break;
                    }
                }
                //Phản hổi 
                InetAddress clientAddress = recivePacket.getAddress();
                int clientPort = recivePacket.getPort();
                byte[] responeData = respone.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(responeData,responeData.length,clientAddress,clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
