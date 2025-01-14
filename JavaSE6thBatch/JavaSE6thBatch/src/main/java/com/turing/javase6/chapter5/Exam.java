/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myan ");
        int myan = scanner.nextInt();
        
        System.out.println("Enter english ");
        int eng = scanner.nextInt();
        
        System.out.println("Enter math ");
        int math = scanner.nextInt();
        
        if( myan >= 40 && eng >= 40 && math >= 40)
        {
            System.out.println("Pass");
            if( myan >= 80)
            {
                System.out.println("Got distinction in Myan");
            }
            if(eng >= 80)
            {
                System.out.println("Got distinction in Eng");
            }
            if(math >= 80)
            {
                System.out.println("Got distinction in Math");
            }
        }
        else
        {
            System.out.println("Fail");
        }
            
        System.out.println("Done");
    }
}
