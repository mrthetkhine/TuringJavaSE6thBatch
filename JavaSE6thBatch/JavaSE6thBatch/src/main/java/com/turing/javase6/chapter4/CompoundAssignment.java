/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class CompoundAssignment {
    public static void main(String[] args) {
        int a= 10;
        int b= 5;
        
        a += b + 2; // a = (a+b+2)
        System.out.println("A "+a);
        
        float f = a;
        //a = f;
        a += f;
    }
}
