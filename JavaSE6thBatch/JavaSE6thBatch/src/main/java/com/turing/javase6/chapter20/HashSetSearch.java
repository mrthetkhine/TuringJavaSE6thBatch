/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.HashSet;

/**
 *
 * @author macbook
 */
public class HashSetSearch {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        
        for (int i = 0; i <= 5_000_000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        boolean contain = set.contains(5_000_000);
        long end = System.currentTimeMillis();
        
        long time = (end - start);
        System.out.println("Time "+time);
    }
}
