/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter18;

/**
 *
 * @author macbook
 */
public class StringMethod2 {
    public static void main(String[] args) {
        String str = "hello world world";
        int index = str.indexOf("world");
        System.out.println("index "+index);
        
        index = str.lastIndexOf("world");
        System.out.println("index "+index);
        
        index = str.indexOf("world",7);
        System.out.println("index "+index);
        
        System.out.println("Substring(3) "+str.substring(3));
        System.out.println("Substring(3,5) "+str.substring(3,5));
        
        System.out.println("replace world-hi "+str.replaceAll("world", "hi"));
        System.out.println("Str "+str);
        
        str = " hello world\r\n ";
        System.out.println("Str.trim >>"+str.trim()+"<<");
        System.out.println("strip "+str.strip());
        
        String str2 = String.valueOf(10);
        System.out.println("Str2 "+str2);
    }
}
