/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class TypeConversion {
    public static void main(String[] args) {
        
        int a = 10;
        long lg = 120;
        float f = 12;
        
        a += f;
        // = f;
        //lg = f;
        
        byte b = 12;
        short sh = 129;
        
        sh = b;
        b = (byte)sh;
        
        System.out.println("Byte "+b);
        
        lg = sh;
        lg = a;
        
        lg = lg + a;//long + int
        
        b =(byte) (b + 2);//promote to int
    }
}
