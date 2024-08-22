/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_16_calculatorserver;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Desktop
 */
public class CalculatorImple extends UnicastRemoteObject implements CalculatorInterface, Serializable{

    public CalculatorImple() throws RemoteException{
    }
    
    @Override
    public double add(double a, double b) throws RemoteException {
       return a+b;
    }

    @Override
    public double subtract(double a, double b) throws RemoteException {
      return a-b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a/b;
    }
    
}
