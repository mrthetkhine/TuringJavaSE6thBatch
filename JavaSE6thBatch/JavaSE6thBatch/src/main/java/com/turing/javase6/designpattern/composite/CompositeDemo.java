/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.composite;

/**
 *
 * @author macbook
 */
public class CompositeDemo {
    public static void main(String[] args) {
        ViewGroup parent = new ViewGroup("Parent1");
        
        parent.addChild(new View("Button"));
        parent.addChild(new View("Label"));
        
        ViewGroup child0 = new ViewGroup("Child0");
        child0.addChild(new View("Button 1 of Child0"));
        child0.addChild(new View("Label 1 of Child0"));
        
        parent.addChild(child0);
        
        parent.paint();
    }
}
