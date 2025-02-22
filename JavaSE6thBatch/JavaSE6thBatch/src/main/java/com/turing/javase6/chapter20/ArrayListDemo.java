/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ArrayListDemo {
    public static void main(String[] args) {
      
        
        List<Integer> first =new ArrayList<>();
        first.add(100);
        first.add(200);
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.add(1,50);
        list.set(3, 300);
        
        list.addAll(first);
        
        list.remove(Integer.valueOf(1));
         
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }
        list.add(40);
       
        System.out.println("Index 1 "+list.get(1));
        
        System.out.println("IndexOf 300 "+list.indexOf(new Integer(300)));
        System.out.println("IndexOf 700 "+list.indexOf(700));
        
        //list.sort((a,b)->a-b);
        Collections.sort(list);
        
        System.out.println("Sorted");
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }
        
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        
        list = List.of(arr);
        
    }
}
