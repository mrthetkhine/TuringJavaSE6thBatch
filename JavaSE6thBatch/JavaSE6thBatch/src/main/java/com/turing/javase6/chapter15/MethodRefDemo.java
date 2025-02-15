/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

/**
 *
 * @author macbook
 */
interface Predicate
{
    boolean check(int n);
}
public class MethodRefDemo {
    public boolean isEven(int n)
    {
        return n %2 ==0;
    }
    public static void main(String[] args) {
        MethodRefDemo obj = new MethodRefDemo();
        
        Predicate pred = obj::isEven;
        System.out.println("Pred "+pred.check(4));
        
    }
}
