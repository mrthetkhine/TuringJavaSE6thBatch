/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter32;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author macbook
 */
public class CheckboxDemo extends CommonFrame{

    @Override
    public void initComponent() {
        this.setLayout(new FlowLayout());
        JLabel lblCheck = new JLabel("Check");
        this.add(lblCheck);
        
        JCheckBox chkCheck = new JCheckBox();
        this.add(chkCheck);
    }
    public static void main(String[] args) {
        new CheckboxDemo();
    }
    
}
