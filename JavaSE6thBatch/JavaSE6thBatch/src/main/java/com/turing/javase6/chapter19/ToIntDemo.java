/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter19;

/**
 *
 * @author macbook
 */
public class ToIntDemo {
    public static void main(String[] args) {
        String data = " 123 ".trim();
        int intData = Integer.parseInt(data);
        System.out.println("IntData "+intData);
        
        float floatData = Float.parseFloat(data);
        System.out.println("Float "+floatData);
        
        String str ="တောသားကြီး";
        System.out.println("str "+str);
        System.out.println("Length "+str.length());
        
        //int တန်ဖိုး = 10;
    }
}
