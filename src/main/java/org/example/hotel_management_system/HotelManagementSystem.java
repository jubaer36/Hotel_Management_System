package org.example.hotel_management_system;

import javax.swing.*;
import java.awt.*;


public class HotelManagementSystem extends JFrame {


    HotelManagementSystem(){
//        setSize(1366, 565);
//        setLocation(100,100);
        setBounds(100,100,1366,565);
        setLayout(null);

        ImageIcon i1  = new ImageIcon(HotelManagementSystem.class.getResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,565);
        add(image);

        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(20,430,1000,90);
        text.setForeground(Color.white);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        image.add(text);

        JButton next = new JButton("Next");
        next.setBounds(1150, 450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.setFont(new Font("serif", Font.PLAIN, 24));
        image.add(next);

        setVisible(true);


    }

    public static void main(String[] args){
        new HotelManagementSystem();
    }

}