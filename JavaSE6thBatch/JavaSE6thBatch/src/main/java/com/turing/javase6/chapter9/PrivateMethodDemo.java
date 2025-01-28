/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter9;

/**
 *
 * @author macbook
 */
interface PrivateMethod
{
    
    static void showLength(String str)
    {
        System.out.println("Length "+getLength(str));
    }
    static private int getLength(String str)
    {
        return str.length();
    }
}
public class PrivateMethodDemo {
    public static void main(String[] args) {
        PrivateMethod.showLength("Hello");
        
    }
}
