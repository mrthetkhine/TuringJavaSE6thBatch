/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
enum Size
{
    Small(5),Medium(7),Large(10),XL(15);
    int size;
    Size(int size)
    {
        this.size = size;
    }
    public int getSize()
    {
        return this.size;
    }
}
public class SizeDemo {
    public static void main(String[] args) {
        Size small = Size.Small;
        Size medium = Size.Medium;
        
        if(medium.getSize() > small.getSize())
        {
            System.out.println("Meidum > Small ");
        }
        System.out.println("Large Ordinal "+ Size.Large.ordinal());
    }
}
