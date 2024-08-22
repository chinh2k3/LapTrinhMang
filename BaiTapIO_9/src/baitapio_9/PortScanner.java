/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_9;

import java.net.*;

/**
 *
 * @author Admin
 */
public class PortScanner {
    public static void checkPort(String urlString){
        int startPort = 1;
        int endPort = 10000;
        System.out.println("Dang quet cac port "+urlString);
        
        for(int i=startPort;i<endPort;i++){
            try{
                Socket socket = new Socket(urlString, i);
                System.out.println("Cong: "+i+" dang mo");
                socket.close();
            }catch(Exception ex){
                //
            }
        }
    }
    public static void main(String[] args){
        checkPort("www.google.com");
    }
}
