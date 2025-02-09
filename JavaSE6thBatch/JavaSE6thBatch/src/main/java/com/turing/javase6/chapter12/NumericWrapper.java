/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
public class NumericWrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println("Byte "+i.byteValue());
        System.out.println("Int "+i.intValue());
        System.out.println("Long "+i.longValue());
        
        i = 30;//int literal->Wrapper->autoboxing
        //Wrapper->primitive->unboxing
        System.out.println("Int value "+(i+1));
    }
}
