/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_13_dns_client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTapIO_13_DNS_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("Nhap domain: ");
                String domain = sc.nextLine();
                //Gửi truy vấn
                byte[] sendData = domain.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);
                
                //Nhận phản hồi
                byte[] reciveData = new byte[1024];
                DatagramPacket recivePacket= new DatagramPacket(reciveData,reciveData.length);
                socket.receive(recivePacket);
                
                
                //Xuất kết quả 
                String ip = new String(recivePacket.getData(),0,recivePacket.getLength());
                System.out.println("Server recive: "+ip);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
