/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
/**
 *
 * @author macbook
 */
public class PredefinedFunctionalInterface {
    static int next(int a)
    {
        return a+1;
    }
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
    static void print(int a)
    {
        System.out.println("A is "+a);
    }
    static int getTen()
    {
        return 10;
    }
    static Integer getLength(String str)
    {
        return str.length();
    }
    static boolean isEven(Integer n)
    {
        return n %2 ==0;
    }
    public static void main(String[] args) {
        BinaryOperator<Integer> op = PredefinedFunctionalInterface::add;
        System.out.println("OP "+op.apply(10, 2));
        
        UnaryOperator<Integer> unary = PredefinedFunctionalInterface::next;
        System.out.println("Next "+unary.apply(10));
        
        Consumer<Integer> consumer = PredefinedFunctionalInterface::print;
        consumer.accept(20);
        
        Supplier<Integer> supplier = PredefinedFunctionalInterface::getTen;
        System.out.println("Supplier "+supplier.get());
        
        Function<String,Integer> function = PredefinedFunctionalInterface::getLength;
        System.out.println("function "+function.apply("Hello"));
        
        Predicate<Integer> pred = PredefinedFunctionalInterface::isEven;
        System.out.println("Pred "+pred.test(10));
    }
}
