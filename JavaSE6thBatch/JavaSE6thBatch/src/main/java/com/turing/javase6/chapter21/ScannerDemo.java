/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = scanner.next();
        
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        
        System.out.println("Name "+name + " Age "+age);
    }
}
