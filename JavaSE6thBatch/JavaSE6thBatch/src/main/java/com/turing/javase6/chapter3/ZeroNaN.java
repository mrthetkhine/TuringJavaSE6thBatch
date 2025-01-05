/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class ZeroNaN {
    public static void main(String[] args) {
        int zero = 0;
        
        float pZero = 0.0f;
        float nZero = -0.0f;
        
        System.out.println("Zero "+ (zero == pZero));
        System.out.println("Zero "+ (nZero == pZero));
        
        //System.out.println("Zero "+ (1/zero));
        System.out.println("NZero "+ (1/nZero));
        System.out.println("PZero "+ (1/pZero));
        
        double result = pZero/ pZero;
        System.out.println("Result "+result);
        
        System.out.println("Result "+( result == result));
        System.out.println("IsNaN "+Double.isNaN(result));
    }
}
