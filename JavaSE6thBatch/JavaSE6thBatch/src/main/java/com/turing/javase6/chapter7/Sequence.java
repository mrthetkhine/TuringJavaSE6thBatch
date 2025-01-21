/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class Sequence {
    void method1()
    {
        System.out.println("Method 1");
        method2();
        System.out.println("Method1 returned");
    }
    void method2()
    {
        System.out.println("Method 2");
        method3();
        System.out.println("Method2 returned");
    }
    void method3()
    {
        System.out.println("Method 3");
        System.out.println("Method 3 returned");
    }
    public static void main(String[] args) {
        Sequence s= new Sequence();
        s.method1();
    }
}
