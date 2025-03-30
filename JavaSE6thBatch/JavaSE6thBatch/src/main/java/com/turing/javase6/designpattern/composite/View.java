/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.composite;

/**
 *
 * @author macbook
 */
public class View extends UIWidget{

    public View(String name)
    {
        super(name);
    }
    
    @Override
    void paint() {
        System.out.println("Paint "+this.name);
    }
    
}
