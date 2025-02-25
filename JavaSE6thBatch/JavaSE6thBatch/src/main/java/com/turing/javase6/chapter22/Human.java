/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class Human implements Serializable{
    String name;
    int age;
    String address;
    
    Human(String name,int age , String address)
    {
        this.name= name;
        this.age = age;
        this.address = address;
    }
}
