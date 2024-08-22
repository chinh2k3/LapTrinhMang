/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_6_product_custumer;

/**
 *
 * @author Admin
 */
public class Cusomer implements Runnable {

    private int idCusomer;
    private Buffer buffer;

    public Cusomer(int idCusomer, Buffer buffer) {
        this.idCusomer = idCusomer;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            if (buffer.getSize() > 0) {
                buffer.remove(idCusomer);
            }
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
