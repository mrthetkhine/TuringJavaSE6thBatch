/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author macbook
 */
public class IteratorDemo {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        
    }
}
