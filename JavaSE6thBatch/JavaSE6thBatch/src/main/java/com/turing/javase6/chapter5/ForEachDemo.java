/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class ForEachDemo {
    public static void main(String[] args) {
        
        int[]arr = {10,20,30,40,50};
        
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Arr ["+i+"] "+arr[i]);
            arr[i] = arr[i]*2;
        }
        
        for(final int a : arr)//a = arr[i]
        {
            System.out.println("A "+a);
            //a = a * 2;
        }
        for(int a : arr)
        {
            System.out.println("A "+a);
           
        }
        final int MAX = 10;
        //MAX = 199;
    }
}
