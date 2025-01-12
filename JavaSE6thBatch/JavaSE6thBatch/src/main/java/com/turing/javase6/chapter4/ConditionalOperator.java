/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter digit ");
        int digit = scanner.nextInt();
        
        String result = digit %2 ==0? "Even": "Odd";
        /*
        if(digit % 2== 0)
        {
            System.out.println("Even ");
        }
        else
        {
            System.out.println("Odd");
        }*/
        System.out.println("Result "+result);
    }
}
