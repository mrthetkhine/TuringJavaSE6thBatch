/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class IntegerTypeDemo {
    public static void main(String[] args) {
        
        byte b = 127 , c;
        
        b ++;
        System.out.println("B "+b);
        
        short d = -32768;
        d --;
        System.out.println("D is "+d);
        
        int e =-2147483648;
        e--;
        System.out.println("E is "+e);
        
        long l = 100_000;
        System.out.println("One lakh "+l);
    }
}
