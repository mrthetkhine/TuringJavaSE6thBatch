/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
public class NullCheck {
    public static void checkHumanForNull(Human h)
    {
        if(h.name == null)
        {
            System.err.println("Name is null");
        }
        if(h.address == null)
        {
            System.err.println("Address is null");
        }
        
    }
    public static void checkData(Data d)
    {
        if(d.value == null)
        {
            System.err.println("value is null");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Data data = new Data();
        checkHumanForNull(h);
        checkData(data);
    }
}
