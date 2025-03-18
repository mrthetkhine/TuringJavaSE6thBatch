/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.abstractfactory;

/**
 *
 * @author macbook
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory factory = new AwtFactory();
        Button button = factory.createButton();
        button.paint();
        
        Label label = factory.createLabel();
        label.paint();
    }
}
