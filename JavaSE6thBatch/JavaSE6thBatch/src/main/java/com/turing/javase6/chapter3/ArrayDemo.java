/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //int a0,a1,a2,a3,a4;
        
        int total = 0;
        int[] ages = {30,20,10,44,50};
        
        System.out.println("Arr[0] "+ages[0]);
        System.out.println("Arr[4] "+ages[4]);
        System.out.println("Length "+ages.length);
        //System.out.println("Arr[5 ] "+ages[5]);
        
        for (int i = 0; i < ages.length; i++) {
            total += ages[i];
        }
        System.out.println("Total age "+total);
    }
}
