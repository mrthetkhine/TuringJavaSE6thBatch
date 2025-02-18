/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter18;

/**
 *
 * @author macbook
 */
public class StringCon {
    public static void main(String[] args) {
        byte []bytes = {65,66,67,68};
        String str = new String(bytes);
        
        System.out.println("str "+str);
        //str.getBytes()
    }
   
}
