/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        
        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        
        while( spliterator.tryAdvance(n->System.out.println("N "+n)));
    }
}
