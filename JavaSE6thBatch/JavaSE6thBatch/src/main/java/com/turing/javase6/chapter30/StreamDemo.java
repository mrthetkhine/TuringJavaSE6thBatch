/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class StreamDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);
        
        Stream<Integer> result = stream.filter((n)->n%2==0);
        
        result.forEach(System.out::println);
    }
}
