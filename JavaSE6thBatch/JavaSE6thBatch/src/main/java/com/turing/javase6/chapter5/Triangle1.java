/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class Triangle1 {
    public static void main(String[] args) {
        /*
        
        ***
        ***
        ***
        ***

        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("--------");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        System.out.println("--------");
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4-i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
