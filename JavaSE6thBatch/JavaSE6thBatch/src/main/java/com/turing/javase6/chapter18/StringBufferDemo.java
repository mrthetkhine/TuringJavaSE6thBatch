/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter18;

/**
 *
 * @author macbook
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer =new StringBuffer();
        double start = System.currentTimeMillis();
        
        for (int i = 0; i < 100_000; i++) {
            buffer.append( i);
        }
        double end = System.currentTimeMillis();
        double time = end-start;
        System.out.println("Time "+time);
    }
}
