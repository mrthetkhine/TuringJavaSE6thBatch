/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter9;

/**
 *
 * @author macbook
 */
interface MyInterface
{
    int getNumber();
    
    default String getString()
    {
        return "Hello World";
    }
    static void hello()
    {
        System.out.println("Hello");
    }
}
class Implementation implements MyInterface
{

    @Override
    public int getNumber() {
        return 100;
    }
    
}
public class DefaultDemo {
    public static void main(String[] args) {
        
        MyInterface myInterface = new Implementation();
        System.out.println("Num "+myInterface.getNumber());
        System.out.println("String "+myInterface.getString());
        
        MyInterface.hello();
        
        System.out.println("Math "+Math.max(10, 2));
    }
}
