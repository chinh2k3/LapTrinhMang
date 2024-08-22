/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_4;

/**
 *
 * @author Admin
 */
public class TaskB implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Task BBBBBBBB");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
