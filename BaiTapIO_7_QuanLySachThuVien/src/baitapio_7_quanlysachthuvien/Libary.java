/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_7_quanlysachthuvien;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Libary {
    
    private List<Book> books;
    
    public Libary(){
        
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book book){
        this.books.add(book);
        System.out.println("I add new book "+book.getTitle());
    }
    
    public synchronized void borrowBook(long id,String bookName){
       
        for(Book book : books){
            if(bookName.equals(book.getTitle())){
                if(book.getAvailable()){
                    book.setAvailable(false);
                    System.out.println(id+":"+"Ban da cho muon sach " + bookName);
                    return;
                }
            }
        }
        System.out.println("Khong the cho muon sach!");
    }
    public synchronized void returnBook(long id,String title){
        for(Book book : books){
            if(title.equals(book.getTitle())){
                if(book.getAvailable()== false){
                    book.setAvailable(true);
                    System.out.println(id+":"+"Ban da cho tra sach " + title);
                    return;
                }
            }
        }
        System.out.println("Khong the cho tra sach!");
    }
    public void display(){
        System.out.println("Libary Book");
        for(Book book : books){
            book.toString();
        }
    }

   
}
