/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class ArithmeticDemo {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = ++ a ;

        System.out.println("C "+c);
        System.out.println("A "+ a);
        System.out.println("A " + a + " B " + b);
        System.out.println(" + " + (a + b));
        System.out.println(" - " + (a - b));
        System.out.println(" * " + (a * b));
        System.out.println(" / " + (a / b));
        System.out.println(" / " + (a / 2.0F));
        System.out.println(" % " + (a % b));
        
        System.out.println("+a "+ (+a) );
        
        System.out.println("");
    }
}
