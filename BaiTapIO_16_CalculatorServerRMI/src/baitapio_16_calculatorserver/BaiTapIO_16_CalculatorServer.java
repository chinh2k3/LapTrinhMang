/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio_16_calculatorserver;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Admin
 */
public class BaiTapIO_16_CalculatorServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // Tạo ra thanh ghi ở server
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Tạo calculator
            CalculatorInterface calculatorSkeleton = new CalculatorImple();
            
            // Đăng ký object cho thanh ghi
            registry.rebind("Calculator", calculatorSkeleton);
            
            while(true)           {
                System.out.println("Server is running ... ");
                Thread.sleep(5000);
            }  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
