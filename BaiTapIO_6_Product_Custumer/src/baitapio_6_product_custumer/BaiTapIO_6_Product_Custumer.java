/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_6_product_custumer;

/**
 *
 * @author Admin
 */
public class BaiTapIO_6_Product_Custumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer buffer = new Buffer(100);
        Producer producer = new Producer(0,buffer);
        producer.start();
        
        Thread cusomer = new Thread(new Cusomer(1,buffer));
        cusomer.start();
        
    }
    
}
