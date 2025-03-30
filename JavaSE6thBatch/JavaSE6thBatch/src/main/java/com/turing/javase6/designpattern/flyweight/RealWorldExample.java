/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.flyweight;

/**
 *
 * @author macbook
 */
public class RealWorldExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        System.out.println("Str== str2 "+(str1==str2));
        
        Integer i = 125;
        Integer j = 125;
        System.out.println("I==j "+(i==j));
    }
}
