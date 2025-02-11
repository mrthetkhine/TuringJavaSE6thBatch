/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

/**
 *
 * @author macbook
 */
class NumberBox<T extends Number>
{
    T value;
    NumberBox(T value)
    {
        this.value = value;
    }
    boolean isGreaterThan(NumberBox<?> another)
    {
        return this.value.longValue() > another.value.longValue();
    }
}
public class WildCardDemo {
    public static void main(String[] args) {
        NumberBox<Double> box1 =new NumberBox<>(10.0);
        NumberBox<Integer> box2 =new NumberBox<>(5);
        NumberBox<Double> box3 =new NumberBox<>(5.0);
        
        //Long 
        System.out.println("Is Gt "+box1.isGreaterThan(box3));
        System.out.println("Is Gt "+box1.isGreaterThan(box2));
    }
}
