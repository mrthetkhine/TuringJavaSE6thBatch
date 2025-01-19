/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter6;

/**
 *
 * @author macbook
 */
public class Greeter {
    
    void greet(String name)
    {
        System.out.println("Hello "+name);
    }
    
    public static void main(String[] args) {
        
        Greeter g = new Greeter();
        
        g.greet("Aung Aung");
        g.greet("Mg Hla");
    }
}
