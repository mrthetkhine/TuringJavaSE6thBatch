/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.composite;

/**
 *
 * @author macbook
 */
//Component
public abstract class UIWidget {
    String name;
    public UIWidget(String name)
    {
        this.name = name;
    }
    abstract void paint();
}
