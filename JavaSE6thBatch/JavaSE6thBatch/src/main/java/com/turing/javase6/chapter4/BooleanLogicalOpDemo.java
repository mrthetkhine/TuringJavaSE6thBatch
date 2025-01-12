/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter4;

/**
 *
 * @author macbook
 */
public class BooleanLogicalOpDemo {
    public static void main(String[] args) {
        
        boolean isRaining = true;
        boolean haveToGoOut = true;
        
        if( isRaining && haveToGoOut)
        {
            System.out.println("Take umbrealla");
        }
        else
        {
            System.out.println("Do not need to take umbrella");
        }
        
        System.out.println("AND ");
        System.out.println("false && false "+ (false && false));
        System.out.println("false && true "+ (false && true));
        System.out.println("true && false "+ (true && false));
        System.out.println("true && true "+ (true && true));
        
        System.out.println("Or ");
        System.out.println("false || false "+ (false || false));
        System.out.println("false || true "+ (false || true));
        System.out.println("true || false "+ (true || false));
        System.out.println("true || true "+ (true || true));
        
        System.out.println("Not ");
        System.out.println("!true "+ (!true));
        System.out.println("!false "+ (!false));
        
        boolean result = false;
        result |= true;
        
        System.out.println("Result "+result);
        
        System.out.println("XOR ");
         System.out.println("false ^ false "+ (false ^ false));
        System.out.println("false ^ true "+ (false ^ true));
        System.out.println("true ^ false "+ (true ^ false));
        System.out.println("true ^ true "+ (true ^ true));
        
    }
}
