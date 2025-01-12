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
public class RelationalOp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark ");
        
        int mark = scanner.nextInt();
        boolean pass = mark >= 40; 
        
        System.out.println("Pass "+pass);
        
        //System.out.println("faalse>false "+ (false > false));
        //System.out.println("faalse>false "+ ("hello" > false));
        
        double a = 10;
        int b= 20;
        System.out.println("A "+a+ " B "+b);
        System.out.println(" a > b "+(a>b));
        System.out.println(" a < b "+(a<b));
        System.out.println(" a >= b "+(a>=b));
        System.out.println(" a <= b "+(a<=b));
        
        a = Double.NaN;
        System.out.println("A "+a+ " B "+b);
        System.out.println(" a > b "+(a>b));
        System.out.println(" a < b "+(a<b));
        System.out.println(" a >= b "+(a>=b));
        System.out.println(" a <= b "+(a<=b));
        
    }
}
