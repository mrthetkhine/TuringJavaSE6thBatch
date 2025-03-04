/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter32;

import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author macbook
 */
public abstract class CommonFrame extends JFrame{
     CommonFrame()
    {
        super("Hello World");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
        /*
        for (String font: fonts) {
            System.out.println("Font "+font);
        }*/
        this.initComponent();
        
        
    }
    public abstract void initComponent();
}
