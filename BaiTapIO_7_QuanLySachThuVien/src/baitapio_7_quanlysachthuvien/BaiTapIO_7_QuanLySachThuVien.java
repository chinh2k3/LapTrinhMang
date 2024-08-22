/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_7_quanlysachthuvien;

import java.util.*;

/**
 *
 * @author Admin
 */
public class BaiTapIO_7_QuanLySachThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libary lib = new Libary();
        //them sach moi
        lib.addBook(new Book("Lap trinh java", "LeNhatTung"));
        lib.addBook(new Book("Kinh te chinh tri", "Thuong"));
        lib.addBook(new Book("Lap Trinh Mang", "Tho"));
        lib.addBook(new Book("An toan bao mat", "Thang"));
        lib.addBook(new Book("Phan tich thiet ke", "Hanh"));

        lib.display();

        // Muon va tra sach
//        lib.borrowBook("Kinh te chinh tri");
//        lib.borrowBook("An toan bao mat");
//        lib.borrowBook("Phan tich thiet ke");
//        lib.returnBook("An toan bao mat");
//        lib.returnBook("Kinh te chinh tri");
        Thread st1 = new Student(1,lib, "Lap trinh java");
        Thread st2 = new Student(2,lib, "An toan bao mat");
        Thread st3 = new Student(3,lib, "Lap Trinh Mang");
        st1.start();
        st2.start();
        st3.start();

    }

}
