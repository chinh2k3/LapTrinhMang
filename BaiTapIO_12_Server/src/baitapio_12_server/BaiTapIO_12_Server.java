/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_12_server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Admin
 */
public class BaiTapIO_12_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //tạo datagram socket
            DatagramSocket socket = new DatagramSocket(9876);
            //mảng dữ liệu nhận được
            byte[] reciveData = new byte[1024];

            int count = 0;
            //cho server chạy vô tận
            while (true) {
                //tạo 1 datapacket với dữ liệu là 1 mảng byte dữ liệu cùng với chiều dài của mảng đó
                DatagramPacket recivePacket = new DatagramPacket(reciveData, reciveData.length);
                //gói tin nhận mà server nhận được
                socket.receive(recivePacket);
                String reciveMessage = new String(recivePacket.getData(), 0, recivePacket.getLength());
                //kiểm tra chiều dài và bỏ khoảng trống 
                if (reciveMessage.trim().length() > 0) {
                    System.out.println("reciveMessage: " + reciveMessage);
                }
                Thread.sleep(2000);
                
            }
            //socket.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
