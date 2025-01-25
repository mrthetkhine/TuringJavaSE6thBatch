/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class Factorial {
    int factorial(int n)
    {
        int result = 1;
        for(int i=1;i<=n;i++)
        {
            result *=i;
        }
        return result;
    }
    int factRec(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n* factRec(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Fact 3 "+fact.factRec(5));
        System.out.println("Fact 4 "+fact.factRec(4));
    }
}
