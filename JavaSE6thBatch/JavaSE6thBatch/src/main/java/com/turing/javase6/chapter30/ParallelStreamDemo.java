/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        
        List<Integer> list2 = list.parallelStream()
            .map(x->x*2)
            .collect(Collectors.toList());
        list2.forEach(System.out::println);
        
        Iterator<Integer> iterator = list.stream().iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
    }
}
