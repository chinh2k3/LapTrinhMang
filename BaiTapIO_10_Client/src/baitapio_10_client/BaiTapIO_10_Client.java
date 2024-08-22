/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_10_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class BaiTapIO_10_Client {

    public static void main(String[] args) {
        try {
            //Kết nối tới server
            int port = 99;
            Socket socket = new Socket("localhost", port);

             
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter write = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String message;
            while (true) {
                
                //Client gửi tin nhắn cho server
                System.out.print("Client:");
                message = sc.nextLine();
                write.println(message);
                write.flush();
                
                message = read.readLine();
                System.out.println("Server: " + message);

            }
        } catch (Exception e) {
            System.out.println("Connect Server fail");
        }
    }

}
