/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.abstractfactory;

/**
 *
 * @author macbook
 */
public class AWTLabel implements Label{

    @Override
    public void paint() {
        System.out.println("AWTLabel Paint");
    }
    
}
