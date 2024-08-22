/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_10_server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Process extends Thread {

    private Socket socket;

    public Process(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter write = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                //Đọc tin nhắn của client
                String message;
                message = read.readLine();
                System.out.println("Client: " + message);

                //Gửi tin nhắn cho client
                System.out.println("Server: ");
                message = sc.nextLine();
                write.println(message);
                write.flush();
            }

        } catch (Exception ex) {

        }
    }
}
