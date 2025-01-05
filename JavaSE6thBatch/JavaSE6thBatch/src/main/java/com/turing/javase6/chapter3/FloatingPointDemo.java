/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

import java.math.BigDecimal;

/**
 *
 * @author macbook
 */
public class FloatingPointDemo {
    public static void main(String[] args) {
        float f = 2.14F;
        double d = 3.14;
        
        System.out.println("Float "+f+ " Double "+d);
        
        double a = 0.3F;
        double b = 0.2F;
        double c = a- b;
        System.out.println("A "+a);
        System.out.println("C "+c);
        
        BigDecimal bdA = new BigDecimal("0.3");
        BigDecimal bdB = new BigDecimal("0.2");
        BigDecimal result = bdA.subtract(bdB);
        System.out.println("Result "+result.toString());
        
        double e = 2.1E5;
        System.out.println("E "+e);
    }
}
