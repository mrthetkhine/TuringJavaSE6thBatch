/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter19;

import java.lang.reflect.Field;

/**
 *
 * @author macbook
 */
class Human
{
    String name;
    int age;
    
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}
class Another
{
    String data;
}
public class ReflectionDemo {
    public static void printFields(Object obj)
    {
        Class clazz = obj.getClass();
        System.out.println("Class "+clazz.getName());
        
        Field[]fields = clazz.getDeclaredFields();
        for(Field field : fields)
        {
            System.out.println("Name "+field.getName() + " Type "+field.getType());
        }
                
    }
    public static void main(String[] args) {
        Human h = new Human("TK",40);
        Another another = new Another();
        
        printFields(h);
        printFields(another);
    }
}
