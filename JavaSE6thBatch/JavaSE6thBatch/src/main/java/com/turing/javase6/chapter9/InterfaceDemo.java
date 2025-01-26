/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter9;

/**
 *
 * @author macbook
 */
class Bird implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
    
}
class Aeroplane implements Flyable
{
    
    @Override
    public void fly() {
        System.out.println("Aeroplane flying");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable f = new Bird();
        f.fly();
        
        f = new Aeroplane();
        f.fly();
           
        System.out.println("Final "+f.SIZE);
                
    }
}
