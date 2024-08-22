/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_14_multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author Admin
 */
public class Sender {
    public static void main(String[] args){
        try{
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket();
            
            String message = "Hello from the sender!";
            byte[] sendData = message.getBytes();
            while(true){
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, group, 6789);
                socket.send(sendPacket);
                Thread.sleep(2000);
            }
        }catch(Exception ex){
            
        }
    }
}
