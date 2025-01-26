/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

import com.turing.javase6.chapter8.Parent;

/**
 *
 * @author macbook
 */
public class Wrapper {
    public static void main(String[] args) {
        Integer int1 = 100;
        Integer int2 = 100;
        
        System.out.println("int1 == int2 "+(int1==int2));
        
        Integer c = 400;
        Integer d= 400;
        System.out.println("C== d "+(c==d));
        Parent parent = new Parent();
        //parent.data ++;
    }
}
