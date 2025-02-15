/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;



/**
 *
 * @author macbook
 */
interface ArithmeticOp
{
    int operation(int a,int b);
}
public class FunctionalInterface {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    static void process(ArithmeticOp op,int a,int b)
    {
        int result = op.operation(a, b);
        System.out.println("Result "+result);
    }
    
    public static void main(String[] args) {
        ArithmeticOp op = FunctionalInterface::add;
        
        System.out.println("Op "+op.operation(1,2));
        
        op = FunctionalInterface::sub;
        System.out.println("Op "+op.operation(1,2));
        
        process(op,5,1);
        
        op = (a,b)-> a+ b* 2;
        System.out.println("Op "+op.operation(1,2));
        
        op=(a,b)->{
            System.out.println("Expression executed");
            return a + b *2;
        };
        System.out.println("Op "+op.operation(1,2));
        
        process((a,b)->a+b*2,10,5 );
    }
}
