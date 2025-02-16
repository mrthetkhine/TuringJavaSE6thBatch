/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);
        
        Function<Integer,Integer> toDouble= n-> n* 2;
        Stream<Integer> result = stream.map(toDouble);
        
        result.forEach(System.out::println);
       
    }
}
