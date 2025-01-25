/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        System.out.println("ToUpper "+str.toUpperCase());
        
        System.out.println("Str1== str2 "+ (str == str2 ));
        System.out.println("Str2 == str3 "+ (str2 == str3));
        
        System.out.println("Equals "+ str2.equals(str3));
        
        String another = str + " Hi";
        System.out.println("Another "+another);
        
        String str4 = null;
        System.out.println("Equals " + ("Hello World".equals(str4)));
        
    }
}
