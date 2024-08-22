/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_11_remoteserver;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class BaiTapIO_11_RemoteServer {
    public static void handleClientRequest(Socket socket){
        try{
            //lấy dữ liệu từ client 
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            
            //in dữ liệu trả lại cho client
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String request;
            request = reader.readLine();
            if(request.equals("shut down")){
                request = "anh chinh";
                writer.println(request);
                writer.flush();
            }else if(request.equals("screenshot")){
                Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage screenshot = new Robot().createScreenCapture(rec);
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(screenshot, "png", baos);
                
                byte[] imageBytes = baos.toByteArray();
                baos.close();
                
                writer.println(imageBytes.length);
                writer.flush();
                socket.getOutputStream().write(imageBytes);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket serverSocket = new ServerSocket(99);
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client conneted"+socket.getInetAddress().getHostAddress());
                
                //Tạo luồng thực thi
                Thread thread = new Thread(()->{handleClientRequest(socket);});
                thread.start();
            }
        }catch(Exception ex){
            
        }
    }
    
}
