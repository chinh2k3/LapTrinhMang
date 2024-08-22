/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_03;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class StudentCard implements Serializable{
    private String name;
    private String address;
    private int phonenumber;
    private String email;
    private String image;
    
    public StudentCard(){
        
    }

    public StudentCard(String name, String address, int phonenumber, String email, String image) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.image = image;
    }

    @Override
    public String toString() {
        return "StudentCard{" + "name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + ", email=" + email + ", image=" + image + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }
    
    
}
