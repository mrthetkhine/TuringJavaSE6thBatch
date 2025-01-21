/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class OverloadDemo {
    
    static void print(short a)
    {
        System.out.println("Short version "+a);
    }
    static void print(int a)
    {
        System.out.println("Integer version "+a);
    }
    static void print(long a)
    {
        System.out.println("Byte version "+a);
    }
    /*
    static int print(long a)
    {
    }*/
    public static void main(String[] args) {
        //System.out.println("Hello");
        //System.out.println(true);
        //System.out.println(123);
        
        byte b = 10;
        print(b);
    }
}
