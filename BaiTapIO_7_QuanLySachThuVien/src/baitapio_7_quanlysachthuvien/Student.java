/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_7_quanlysachthuvien;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Student extends Thread {
    private long id;
    private Libary lib;
    private String title;

    public Student(long id, Libary lib, String title) {
        this.lib = lib;
        this.title = title;
        this.id =id;
    }

    @Override
    public void run() {
            try {
                for (int i = 0; i < 5; i++) {  
                    lib.borrowBook(id,title);
                    Thread.sleep((long) (Math.random()*100));
                    lib.returnBook(id,title);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        
    }
    
    
}
