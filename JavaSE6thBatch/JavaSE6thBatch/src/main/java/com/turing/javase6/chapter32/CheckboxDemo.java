/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter32;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
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
        
        CheckboxGroup cbGroup = new CheckboxGroup();
        
        JLabel lblMale = new JLabel("Male");
        //this.add(lblMale);
        
        Checkbox chkMale = new Checkbox("Male ",cbGroup,false);
        this.add(chkMale);
        
        chkMale.addItemListener(eve->{
            System.out.println("chkMale click "+eve.getStateChange());
        });
         
        JLabel lblFeMale = new JLabel("Female");
        //this.add(lblFeMale);
        
        Checkbox chkFemale = new Checkbox("Female",cbGroup,false);
        this.add(chkFemale);
        
        chkFemale.addItemListener(eve->{
            System.out.println("chkFemale click "+eve.getStateChange());
        });
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new CheckboxDemo().setVisible(true);
            }
        });
       
    }
    
}
