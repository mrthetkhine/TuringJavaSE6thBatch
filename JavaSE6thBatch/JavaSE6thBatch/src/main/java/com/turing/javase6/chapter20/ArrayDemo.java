/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        int []arr2 = {1,2,3};
        int []arr3 = {4,5,6,7};
        int []arr4 = new int[3];
        
        Arrays.fill(arr4, 10);
        for(int item: arr4)
        {
            System.out.println("Item "+item);
        }
        System.out.println("Array.equals "+Arrays.equals(arr,arr2));
        arr4 = Arrays.copyOf(arr3, 4);
        
        for(int item: arr4)
        {
            System.out.println("Item "+item);
        }
    }
}
