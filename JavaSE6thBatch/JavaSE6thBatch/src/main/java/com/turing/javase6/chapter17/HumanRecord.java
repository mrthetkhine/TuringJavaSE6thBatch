/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
public record HumanRecord(String name,int age) {

    //canonoical constructor
    /*
    public HumanRecord(String name, int age)
    {
        this.name = name.trim();
        this.age = age;
    }
    */
    //compact constructor
    public HumanRecord
    {
        name = name.trim();
    }
    
    public HumanRecord(String name)
    {
        this(name,0);
    }
    
    String nameInUpperCase()
    {
        return this.name.toUpperCase();
    }
}
