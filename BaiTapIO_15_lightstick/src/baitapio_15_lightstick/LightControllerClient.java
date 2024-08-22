/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapio_15_lightstick;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */


class LightControllerGui {

    private JLabel lightLabel;
    private JPanel mainPanel;

    public void createLightController() {
        JFrame fame = new JFrame();
        fame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        lightLabel = new JLabel("Light Status: ");
        lightLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(lightLabel, BorderLayout.CENTER);

        fame.setMaximumSize(new Dimension(100, 200));
        fame.getContentPane().add(mainPanel);
        fame.pack();
        fame.setVisible(true);
        ConnectServer();
    }

    public void ConnectServer() {
        try {
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket(6789);
            socket.joinGroup(group);

            while (true) {
                byte[] reciveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(reciveData, reciveData.length);
                socket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                colorChange(message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void colorChange(String color) {
        if (color.equals("red")) {
            mainPanel.setBackground(Color.red);
            System.out.println("OK1");
        } else if (color.equals("blue")) {
            mainPanel.setBackground(Color.blue);
            System.out.println("OK2");
        } else if (color.equals("green")) {
            mainPanel.setBackground(Color.green);
            System.out.println("OK3");
        }
    }
}
public class LightControllerClient {

    public static void main(String[] args) {
        LightControllerGui gui = new LightControllerGui();
        gui.createLightController();
    }
}