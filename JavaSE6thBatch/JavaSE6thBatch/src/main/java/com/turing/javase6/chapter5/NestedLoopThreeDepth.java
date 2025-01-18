/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class NestedLoopThreeDepth {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("I ===> "+i);
            
            for (int j = 0; j < 4; j++) {
                
                System.out.println("Hello World");
                System.out.println("J ====> "+j);
                
                for (int k = 0; k < 5; k++) {
                    System.out.println("K =====> "+j);
                    
                }
            }
        }
    }
}
