/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class AssignmentOp {
    public static void main(String[] args) {
        int a;
        a = 10;
        
        System.out.println("A "+a);
        int b= 20;
        
        a = b;//copy
        b = 40;
        System.out.println("A "+a + " B "+b);
    }
}
