/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_6_product_custumer;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Buffer {
    //khả năng chứa tối đa
    private int capacity;
    //Danh sách sản phẩm
    private ArrayList<Integer> products = new ArrayList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }
    
    
    
    public void add(int product,int producerID){
        System.out.println("--------------------------------------");
        System.out.println("Nha san xuat"+producerID+"da them san pham"+product);
        products.add(product);
        System.out.println("So luong ton kho"+products.size());
    }
    
    public void remove(int customerID){
        System.out.println("---------------------------------------");
        System.out.println("Khach hang"+customerID+"da mua san pham"+products.getFirst());
        products.remove(0);
    }
    
    public int getSize(){
        return this.products.size();
    }

    public int getCapacity() {
        return capacity;
    }

    
    
    
}
