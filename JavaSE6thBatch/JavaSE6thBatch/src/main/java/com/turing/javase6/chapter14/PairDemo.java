/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

/**
 *
 * @author macbook
 */
class Pair<T,U>
{
    T first;
    U second;
    
    Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    
}
public class PairDemo {
    static Pair<Integer,String> getSomething()
    {
        return new Pair(10,"Hello");
    }
    public static void main(String[] args) {
        Pair<Integer,String> data = getSomething();
        System.out.println("Data.first "+data.getFirst());
        System.out.println("Data.second "+data.getSecond());
    }
}
