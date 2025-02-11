/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

import java.util.Date;

/**
 *
 * @author macbook
 */
class BoxGen<T>
{
    T value;
    public BoxGen(T value)
    {
        this.value = value;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        BoxGen<String> box1 = new BoxGen<>("Hello");
        BoxGen<Date> box2 = new BoxGen<>(new Date());
        
        String str1 = box1.value;
        System.out.println("Str1 "+str1.toLowerCase());
        
        BoxGen<Integer> box3 = new BoxGen<>(3);
        
        Object obj = (Object)box1;
       
        
        System.out.println("Instanceof "+ (box3 instanceof BoxGen<Integer>));
        System.out.println("Box1 type "+box1.getClass());
        System.out.println("Box3 type "+box3.getClass());
    }
}
