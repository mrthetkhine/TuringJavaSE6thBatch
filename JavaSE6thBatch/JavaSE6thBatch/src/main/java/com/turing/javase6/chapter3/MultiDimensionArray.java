/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter3;

/**
 *
 * @author macbook
 */
public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][]matrix ={
                {1,2,3},
                {10,4,5,6,14},
                {7,8,9},          
                {10,11,12},          
        };
        System.out.println("Length "+matrix.length);
        System.out.println("Arr[1].length "+matrix[1].length);
        
        System.out.println("matrix "+matrix[3][1]);
        System.out.println("matrix "+matrix[1][2]);
        ///System.out.println("matrix "+matrix[0][3]);
        
        matrix[0][2] = 100;
        System.out.println("Matrix "+matrix[0][2]);
    }
}
