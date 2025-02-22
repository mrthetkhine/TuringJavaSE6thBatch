/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter19;

/**
 *
 * @author macbook
 */
public class CodeFlow {
    static void method2()
    {
        System.out.println("Method2 ");
        StackTraceElement elements[]= Thread.currentThread().getStackTrace();
        for(StackTraceElement ele : elements)
        {
            System.out.println("Ele class "+ele.getClassName()+" method "+ele.getMethodName()+ " line no "+ele.getLineNumber());
        }
    }
    static void method3()
    {
        System.out.println("Method3");
        method2();
    }
    static void method1()
    {
        System.out.println("Method 1");
        method2();
    }
    public static void main(String[] args) {
        method1();
        //method3();
    }
}
