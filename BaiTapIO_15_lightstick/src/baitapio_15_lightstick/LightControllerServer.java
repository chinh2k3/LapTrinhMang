/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_15_lightstick;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LightControllerServer {

    public static void main(String[] args) {
        
        try {
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket();

            String[] colors = {"red", "blue", "green"};
            int indexColor = 0;

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("what color is your favorite ?");
                System.out.println("0.red");
                System.out.println("1.blue");
                System.out.println("2.green");
                
                indexColor = sc.nextInt();
                sc.nextLine();
                if(indexColor > 2 || indexColor <0){
                    indexColor = 0;
                }
                //send
                String message = colors[indexColor];
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, group, 6789);
                socket.send(sendPacket);
                
                Thread.sleep(5000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
