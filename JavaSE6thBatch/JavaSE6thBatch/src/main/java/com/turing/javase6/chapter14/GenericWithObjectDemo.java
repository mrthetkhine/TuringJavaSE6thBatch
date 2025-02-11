/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

import java.util.Date;

/**
 *
 * @author macbook
 */
class BoxObject
{
    Object value;
    
    BoxObject(Object value)
    {
        this.value = value;
    }
}
public class GenericWithObjectDemo {
    public static void main(String[] args) {
        BoxObject obj1 = new BoxObject("Hello");
        BoxObject obj2= new BoxObject(new Date());
        
        String str =(String)obj2.value;
        System.out.println("str "+str.toLowerCase());
    }
}
