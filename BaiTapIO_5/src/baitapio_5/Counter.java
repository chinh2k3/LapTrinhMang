/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_5;

/**
 *
 * @author Admin
 */
public class Counter {
    //Đồng Bộ: tại 1 thời điểm chỉ có 1 thread được tương tác với giá trị
    private int count;
    //Synchronized: đồng bộ, tại 1 thời điểm chỉ có 1 thread gọi
    public synchronized void increment(){
        count++;
    }
    
    public int getCount(){
        return count;
    }
}
