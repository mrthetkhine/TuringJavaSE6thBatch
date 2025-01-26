/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
public class Doctor extends Human{
    
    String speciality;
    Doctor(String name,int age,String speciality)
    {
        super(name,age);
        this.speciality = speciality;
    }
    /*
    public void eat()
    {
        System.out.println("Doctor eat");
    }*/
    @Override
    public void work()
    {
        System.out.println("Dr "+this.name +" treat his patient ");
    }
}
