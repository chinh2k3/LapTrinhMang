/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_7_quanlysachthuvien;

/**
 *
 * @author Admin
 */
public class Book {
    private String title;
    private String author;
    private boolean available;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", available=" + available + '}';
    }
    
}
