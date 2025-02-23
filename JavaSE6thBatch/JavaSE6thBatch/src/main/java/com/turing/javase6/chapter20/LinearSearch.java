/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

/**
 *
 * @author macbook
 */
public class LinearSearch {
    public static int search(int arr[],int item)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == item)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,4,5,1,12};
        System.out.println("Search 3 "+search(arr,3)); 
        System.out.println("Search 5 "+search(arr,5));
    }
}
