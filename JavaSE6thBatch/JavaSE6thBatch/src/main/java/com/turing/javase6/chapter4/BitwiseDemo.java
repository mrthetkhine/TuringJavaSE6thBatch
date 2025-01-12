/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseDemo {
    public static void main(String[] args) {
        int a= 2;
        int b = 3;
        
        System.out.println("A "+Integer.toBinaryString(a));
        System.out.println("B "+Integer.toBinaryString(b));
        System.out.println("A & B "+Integer.toBinaryString(a & b));
        System.out.println("A | B "+Integer.toBinaryString(a | b));
        System.out.println("A ^ B "+Integer.toBinaryString(a ^ b));
        System.out.println("~A "+Integer.toBinaryString(~a));
    }
}
