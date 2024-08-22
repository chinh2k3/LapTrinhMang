/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_8;

import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class BaiTapIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String domain = "www.google.com";
            InetAddress address = InetAddress.getByName(domain);
            System.out.println("Ten Mien: "+domain);
            System.out.println("LocalHost: "+address.getHostAddress());
            
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Dia chi IP cua localHost:"+localhost);
            
            int port = 99;
            Socket socket = new Socket("localhost", port);
            System.out.println("Connect Server Success");
        }catch(Exception ex){
            
        }
    }
    
}
