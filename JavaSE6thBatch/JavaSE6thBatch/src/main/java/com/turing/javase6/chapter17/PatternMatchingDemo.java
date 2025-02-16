/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
public class PatternMatchingDemo {
    public static void main(String[] args) {
        Number num = Float.valueOf(2);
        
        if(num instanceof Integer)
        {
            System.out.println("Num is integer");
        }
        //Float f = (Float)num;
        else if(num instanceof Float f)
        {
            System.out.println("Num is float");
           
            System.out.println("F "+f);
        }
        Object[] list = {
            "Alpha",
            "Beta",
            "Theta",
            Integer.valueOf(100),
            "Gamma",
        };
        for (int i = 0;(list[i] instanceof String str) && i < list.length; i++) {
            System.out.println("Str "+str);
        }
    }
}
