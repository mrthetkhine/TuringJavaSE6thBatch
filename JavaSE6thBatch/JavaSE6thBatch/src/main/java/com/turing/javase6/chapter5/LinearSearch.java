/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class LinearSearch {
    public static void main(String[] args) {
        int []arr= {1,2,11,21,3,8,6};
        int item = 11;
        
        /*
        int i=0;
        for ( ; i < arr.length; i++) {
            if(arr[i]== item )
            {
                System.out.println("Found at index "+i);
                break;
            }
            System.out.println("Loop "+i);
        }
        System.out.println("I "+i);
        */
        int i=0;
        boolean found = false;
        while( i < arr.length && !found )
        {
            if(arr[i]== item )
            {
                System.out.println("Found at index "+i);
                found = true;
            }
            i++;
        }
        System.out.println("I "+i);
        
    }
}
