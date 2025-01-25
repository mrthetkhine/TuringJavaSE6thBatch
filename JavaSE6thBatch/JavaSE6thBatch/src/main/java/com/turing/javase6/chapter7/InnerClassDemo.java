/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
class Outer
{
    int outerValue =10;
    
    void method()
    {
        Inner inner = new Inner();
        inner.innerMethod();
        
        System.out.println("Outervalue "+this.outerValue);
    }
    class Inner
    {
        int innerValue;
        void innerMethod()
        {
            outerValue++;
            System.out.println("Inner method");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
        
        Integer data = new Integer(109);
    }
}
