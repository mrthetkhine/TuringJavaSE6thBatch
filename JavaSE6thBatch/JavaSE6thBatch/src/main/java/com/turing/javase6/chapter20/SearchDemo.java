/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class SearchDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= 5_000_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        int index= list.indexOf(5_000_000);
        long end = System.currentTimeMillis();
        
        long time = (end - start);
        System.out.println("Time "+time);
    }
}
