/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
public class WrapperProblem {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(127);
        Integer j = Integer.valueOf(127);
        
        System.out.println("i == j "+(i==j));
        System.out.println("i == j "+(i.intValue() ==j.intValue()));//ref equality
        
        i = 128;
        j = 128;
        
        System.out.println("i == j "+(i==j));
        
        i = null;
        System.out.println("i == 128 "+ (i == j));
    }
}
