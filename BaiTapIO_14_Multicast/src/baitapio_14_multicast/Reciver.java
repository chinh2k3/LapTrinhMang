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
public class Reciver {
    public static void main(String[] args) {
        
        try{
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket(6789);
            socket.joinGroup(group);
            
            while(true){
                byte[] reciveData = new byte[1024];
                DatagramPacket recivePacket = new DatagramPacket(reciveData, reciveData.length);
                socket.receive(recivePacket);
                
                String message = new String(recivePacket.getData(), 0, recivePacket.getLength());
                System.out.println("Recive: "+message);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
