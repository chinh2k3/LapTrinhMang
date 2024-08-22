/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_5;

/**
 *
 * @author Admin
 */
public class BaiTapIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter counter = new Counter();

        Thread th1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }

                }
        );
        
        Thread th2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }

                }
        );
        
        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println(counter.getCount());
    }

}
