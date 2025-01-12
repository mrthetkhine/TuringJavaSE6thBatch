/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class ShitOperator {
    public static void main(String[] args) {
        int a= 12;
        
        System.out.println("a 12 "+Integer.toBinaryString(a));
        System.out.println("a 12>>1 "+Integer.toBinaryString(a>>1));
        System.out.println("a 12>1 "+(a>>1));
        
        System.out.println("a 12<<1 "+Integer.toBinaryString(a<<1));
        System.out.println("a 12<<1 "+(a<<1));
    }
}
