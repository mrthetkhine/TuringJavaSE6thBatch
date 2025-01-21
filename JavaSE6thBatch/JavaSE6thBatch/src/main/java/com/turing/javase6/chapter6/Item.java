/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter6;

/**
 *
 * @author macbook
 */
public class Item {
    
    int data;
    
    Item(int data)
    {
        System.out.println("Constructor");
        this.data = data;
    }

    @Override
    public String toString() {
        System.out.println("To String called");
        return "Item{" + "data=" + data + '}';
    }
    
    public static void main(String[] args) {
        
        Item item1 = new Item(10);
        Item item2 = new Item(20);
        
        item2 = null;
        
        System.out.println("Item "+item1);
    }
}
