/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer i ==> "+i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner j "+j);
            }
        }
        System.out.println("Done");
    }
}
