/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

/**
 *
 * @author macbook
 */
public class GenMethod {
    static<T extends Number> boolean isGt(T value1,T value2)
    {
        return value1.longValue() >  value2.longValue();
                
    }
    public static void main(String[] args) {
        Integer a = 10;
        Float b = 5.0f;
        System.out.println("isGtV1 "+ isGt(a,b));
    }
}
