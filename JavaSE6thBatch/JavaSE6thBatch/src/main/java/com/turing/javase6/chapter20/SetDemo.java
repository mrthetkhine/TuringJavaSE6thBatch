/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author macbook
 */
public class SetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set ;//= new TreeSet<>();
        set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        
        for(Integer item : set)
        {
            System.out.println("Item "+item);
        }
        System.out.println("Has 1 "+set.contains(1));
    }
}
