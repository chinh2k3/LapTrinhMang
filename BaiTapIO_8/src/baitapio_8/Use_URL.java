/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class Use_URL {
    public static void main(String[] args){
        try{
            //Tạo đối tượng url
            String urlString = "https://whitehat.vn/threads/lam-an-toan-thong-tin-thi-hoc-gi.5281/";
            URL url = new URL(urlString);
            
            //Đọc dữ liệu
            InputStreamReader is = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(is);
            String line;
            while((line = br.readLine())!=null ){
                System.out.println(line);
            }
        }catch(Exception ex){
            
        }
    }
}
