/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

/**
 *
 * @author macbook
 */
class TwoD<T extends Number>
{
    T x,y;
    
    TwoD(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    
    long getTotal()
    {
        return x.intValue() + y.intValue();
    }
}
public class TwoDDemo {
    public static void main(String[] args) {
        TwoD<Integer> obj1 = new TwoD<>(10,2);
        TwoD<Long> obj2 = new TwoD<>(10L,2L);
        
        System.out.println("Obj1 "+obj1.getTotal());
        System.out.println("Obj2 "+obj2.getTotal());
        
        
    }
}
