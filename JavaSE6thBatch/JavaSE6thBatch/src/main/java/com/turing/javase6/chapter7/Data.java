/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
public class Data {
    int value;
    
    Data(int value)
    {
        this.value = value;
    }
    static void process(int a)
    {
        a++;
    }
    static void process(Data data)
    {
        data.value++;
    }
    static void process2(Data data)
    {
        data = new Data(500);
    }
    public static void main(String[] args) {
        Data obj = new Data(100);
        Data obj2 = new Data(200);
        
        System.out.println("obj== obj2 "+ (obj == obj2));
        int item = 10;
        process(item);// a = item;copy
        
        System.out.println("Item "+item);
        
        process(obj);// data = obj
        System.out.println("Data "+obj.value);
        
        process2(obj);
        System.out.println("Data "+obj.value);
        
    }
}
