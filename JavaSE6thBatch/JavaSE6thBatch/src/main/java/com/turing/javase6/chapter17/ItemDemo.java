/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
record Item(String name,float price, int quantity)
{
    float total()
    {
        return this.price * this.quantity;
    }
}
public class ItemDemo {
    public static void main(String[] args) {
        Item item1 = new Item("Apple",10,2);
        System.out.println("Total "+item1.total());
    }
}
