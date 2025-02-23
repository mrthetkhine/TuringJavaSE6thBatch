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
public class AlgorithmDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(10);
        
        Collections.sort(list);
        
        int index = Collections.binarySearch(list, 5);
        System.out.println("Index "+index);
        
        Collections.shuffle(list);
        for(Integer item : list)
        {
            System.out.println("Item "+item);
        }
        
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println("Min "+min + " Max "+max);
    }
}
