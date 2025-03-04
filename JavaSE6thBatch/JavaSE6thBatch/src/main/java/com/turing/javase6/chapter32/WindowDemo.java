/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter32;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author macbook
 */
public class WindowDemo extends JFrame implements ActionListener{
    
    WindowDemo()
    {
        super("Hello World");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts= ge.getAvailableFontFamilyNames();
        /*
        for (String font: fonts) {
            System.out.println("Font "+font);
        }*/
        this.initComponent();
        
        
    }
    void initComponent()
    {
        this.setLayout(new FlowLayout());
        JLabel lblName = new JLabel("Name");
        this.add(lblName);
        this.add(new JLabel("Two"));
        this.add(new JLabel("Three"));
        
        JButton btnOk = new JButton("Ok");
        /*
        btnOk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("btnOk Clicked");
            }
        });*/ 
        //btnOk.addActionListener(this);
        btnOk.addActionListener(ae->System.out.println("Btn Ok clicked"));
        this.add(btnOk);
        
        Button btnCancel = new Button("Cancel");
        btnCancel.addActionListener(this);
        
        this.add(btnCancel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed "+e.getActionCommand());
        String command = e.getActionCommand();
        if("Ok".equals(command))
        {
            System.out.println("Click btnOk");
        }
        else if("Cancel".equals(command))
        {
            System.out.println("Click btnCancel");
        }
    }
    /*
    public void paint(Graphics g)
    {
        System.out.println("Paint");
        Dimension screenSize = this.getSize();
        
        g.setFont(new Font("Georgia",Font.PLAIN,18));
        g.drawString("Hello World", 100,200);
        //this.setBackground(Color.GRAY);
        //this.setForeground(Color.BLUE);
        
        g.drawLine(10, 10, 100, 10);
        
        g.drawArc(100, 200, 50, 50, 0, 360);
    }*/
    public static void main(String[] args) {
        new WindowDemo().setVisible(true);
    }

    
}
