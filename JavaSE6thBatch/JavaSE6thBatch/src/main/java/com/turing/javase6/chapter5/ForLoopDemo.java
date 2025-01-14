/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; //initialization
                i <= 10; //condition
                i++) {//step
            System.out.println("Loop "+i);
            total += i;
            
        }
        System.out.println("Total "+total);
        for (int i = 9; i >=0; i--) {
            System.out.println("Loop Reverse "+i);
        }
    }
}
