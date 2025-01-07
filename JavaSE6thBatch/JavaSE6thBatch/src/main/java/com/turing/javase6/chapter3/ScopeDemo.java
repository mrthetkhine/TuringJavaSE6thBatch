/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int c = 10;
        {
            //int c = 20;
            int a = 10;
            System.out.println("A is "+a);
        }
        String a= "Hello";
        System.out.println("C is "+c);
        System.out.println("A "+a);
    }
}
