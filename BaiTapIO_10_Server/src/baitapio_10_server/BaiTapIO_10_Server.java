/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_10_server;

import java.net.ServerSocket;
import java.net.Socket;

public class BaiTapIO_10_Server {

    public static void main(String[] args) {

        try {
            // Tạo server socket và lắng nghe
            int port = 99;
            ServerSocket serverSocket = new ServerSocket(port);
            
            // Chấp nhận nhiều kết nối
            while(true){
                // Chấp nhận kết nối từ 1 Client
                Socket clientSocket = serverSocket.accept();
                Process mp = new Process(clientSocket);
                mp.start();
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

