/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter6;

/**
 *
 * @author macbook
 */
public class Box {
    int width, height,depth;
    
    int volume()
    {
        return this.width * this.height * this.depth;
    }
    public void setDimension(int width,int height,int depth)
    {
        this.width = width;
        this.height = height;
        this.depth =depth;
    }
    public static void main(String[] args) {
        int a = 10;
        Box box1 = new Box();
        Box box2 = new Box();
        
        box1.setDimension(10, 2, 5);
        
        int volume = box1.volume();
        
        box2.setDimension(5, 12, 5);
        
        int volume2 = box2.volume();
        
        System.out.println("Volume "+volume);
        System.out.println("Voluem2 "+volume2);
    }
}
