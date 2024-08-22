/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_8;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Admin
 */
public class CheckWeb {
    public static void checkWeb(String urlString){
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //http code: 200,401,404,500,403
            int responCode = conn.getResponseCode();//lấy ra 400,404,200,
            if(responCode == 200){
                System.out.println(urlString+" Hoat dong binh thuong");
            }else{
                System.out.println(urlString+" Khong hoat dong");
            }
        } catch (Exception ex) {
            
        }
    }
    public static void main(String[] args){
        String[] webside= {"https://google.com ","https://youtube.com","https://TITV.vn"};
        for(String str : webside){
            checkWeb(str);
        }
    }
}
