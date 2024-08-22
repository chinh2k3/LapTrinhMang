/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_11_remoteclient;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
//C:\Users\Admin\OneDrive\Documents\image
/**
 *
 * @author Admin
 */
public class BaiTapIO_11_RemoteClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket clientSocket = new Socket("localhost", 99);
            Scanner sc = new Scanner(System.in);
            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);

            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
            String message;
            while (true) {
               System.out.println("----------Menu----------");
                System.out.println("1.shut down");
                System.out.println("2.reset");
                System.out.println("3.screenshot");
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        writer.println("shut down");
                        writer.flush();
                        break;
                    case 2:
                        writer.println("reset");
                        writer.flush();
                        break;
                    case 3:
                        writer.println("screenshot");
                        writer.flush();
                        int imageSize = Integer.parseInt(reader.readLine());
                        byte[] image = new byte[imageSize];
                        int byteRead = clientSocket.getInputStream().read(image);
                        if(imageSize > 0){
                            System.out.print("Nhap ten anh: ");
                            String fileName = sc.nextLine();
                            Path imagePaths = Paths.get(fileName+".png");
                            Files.write(imagePaths,image);
                        }
                        break;
                    default:
                }
                message = reader.readLine();
                System.out.print("Server: "+message);
            }
        } catch (Exception ex) {

        }

    }

}
