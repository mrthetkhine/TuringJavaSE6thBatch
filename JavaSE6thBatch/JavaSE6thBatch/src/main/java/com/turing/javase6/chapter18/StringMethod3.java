/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter18;

/**
 *
 * @author macbook
 */
public class StringMethod3 {
    public static void main(String[] args) {
        String str = "hello world";
        
        System.out.println("str toUpper "+str.toUpperCase());
        System.out.println("str toLower "+str.toLowerCase());
        System.out.println("str "+str);
        
        String str2 = String.join(";", "Hello","World");
        System.out.println("str2 "+str2);
        
        String[] arr = str2.split(";");
        for(String item : arr)
        {
            System.out.println("Item "+item);
        }
    }
}
