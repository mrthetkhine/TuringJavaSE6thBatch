/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
class Data
{
    int value;
    static int counter;
    
    static
    {
        System.out.println("Static Initializer 1");
    }
    static{
        System.out.println("Static Initializer 2");
    }
    public Data(int value)
    {
        System.out.println("Data Constructor");
        this.value = value;
        
        //this.counter++;
        Data.counter++;
    }
    static void hello()
    {
        System.out.println("Hello static");
    }
    static void anotherStatic()
    {
        System.out.println("Another static");
        //normal();
        //value++;
    }
    
    void normal()
    {
        System.out.println("Non static");
        hello();
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Data obj = new Data(100);
        Data obj2 = new Data(200);
        
        obj.value++;
        System.out.println("Obj "+obj.value);
        System.out.println("Ojb2 "+obj2.value);
        
        System.out.println("Obj1.counter "+obj.counter);
        System.out.println("Obj2.counter "+obj2.counter);
        
        System.out.println("Data.counter "+Data.counter);
        
        obj.normal();
        
        Data.anotherStatic();
    }
    
}
