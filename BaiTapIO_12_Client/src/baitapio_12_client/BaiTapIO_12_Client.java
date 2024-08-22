/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_12_client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Admin
 */
public class BaiTapIO_12_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            int i = 0;
            while (true) {
                String messString = "Hello UDP server"+i;
                //tạo mảng dữ liệu để gửi 
                byte[] sendData = messString.getBytes();
                //tạo gói dữ liệu gửi với mảng dữ liêu gửi, chiều dài mảng, địa chỉ server, địa chỉ cổng
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);
                i++;
            }
            //socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
