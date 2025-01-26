/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
public class Human {
    String name;
    int age;
    
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    final public void eat()
    {
        System.out.println(this.name +" eat ");
    }
    public void work()
    {
        System.out.println(this.name +" work ");
    }
}
