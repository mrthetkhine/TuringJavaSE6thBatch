/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter13;

/**
 *
 * @author macbook
 */
class Parent
{
}
class Child extends Parent
{
}
        
public class InstanceOfDemo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child instanceof Child "+(child instanceof Child));
        System.out.println("child instanceof Parent "+(child instanceof Parent));
        System.out.println("child instanceof Object "+(child instanceof Object));
        
        Object ch = child;
        System.out.println("child instanceof String "+(ch instanceof String));
    }
}
