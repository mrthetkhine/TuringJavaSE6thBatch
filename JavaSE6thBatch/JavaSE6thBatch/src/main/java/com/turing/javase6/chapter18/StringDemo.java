/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter18;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = """
                      Hello
        """;
        String str3 = "Hello";
        String str4 = new String("Hello");
        
        System.out.println("str1 == str2 "+(str1 == str2));
        System.out.println("St1== str3 "+ ( str1== str3));
        System.out.println("str3== str4 "+(str3==str4));
        
        System.out.println("Equal "+ str1.equals(str2));
        System.out.println("Str3 "+str3.equals(str4));
        
        str4 = null;
        //str4.equals();
        //System.out.println(str4.equals("Hello"));
        System.out.println("Hello".equals(str4));
    }
}
