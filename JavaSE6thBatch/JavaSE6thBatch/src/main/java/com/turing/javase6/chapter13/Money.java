/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter13;

/**
 *
 * @author macbook
 */
public class Money {
    int amount;
    
    public Money(int amount)
    {
        this.amount = amount;
    }
    public boolean equals(Money another)
    {
        return this.amount == another.amount;
    }
    public static void main(String[] args) {
        Money m1 = new Money(10);
        Money m2 = new Money(10);
        
        System.out.println("Equals "+m1.equals(m2));
        System.out.println("m1== m2 "+ (m1==m2));
    }
}
