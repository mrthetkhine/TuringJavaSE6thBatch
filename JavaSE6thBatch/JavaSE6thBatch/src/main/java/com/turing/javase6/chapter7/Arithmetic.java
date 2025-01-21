/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class Arithmetic {
    int add(int a, int b)
    {
        return a + b;
    }
    float add(float a, float b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.add(10, 2);
        System.out.println("Result "+result);
        
        float result2 = arithmetic.add(1.2F, 2.3F); 
        System.out.println("Result2 "+result2);
    }
}
