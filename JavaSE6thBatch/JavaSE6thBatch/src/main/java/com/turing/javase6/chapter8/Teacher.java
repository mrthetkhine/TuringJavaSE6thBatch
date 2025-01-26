/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
public class Teacher extends Human{
    String subject;
    
    Teacher(String name, int age, String subject)
    {
        super(name,age);
        this.subject = subject;
    }
    @Override
    public void work()
    {
        System.out.println("Tr "+this.name +" teach student ");
    }
}
