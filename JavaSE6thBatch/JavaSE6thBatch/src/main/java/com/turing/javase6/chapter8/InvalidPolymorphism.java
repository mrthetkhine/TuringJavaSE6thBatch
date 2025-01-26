/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
class ParentBase
{
    static void method()
    {
        System.out.println("Base");
    }
}
class Child extends ParentBase
{
    static void method()
    {
        System.out.println("Child");
    }
}
public class InvalidPolymorphism {
    public static void main(String[] args) {
        ParentBase b = new Child();
        b.method();
    }
}
