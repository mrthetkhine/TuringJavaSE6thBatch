/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class OtherMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        
        list.add(1);
        list.add(-10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(50);
        
        System.out.println("Distinct");
        list.stream()
            .distinct()
            .forEach(System.out::println);
        
        System.out.println("");
        boolean allEven = list.stream()
            .allMatch((n)->n%2==0);
        System.out.println("All even "+allEven);
        
        boolean someEven = list.stream()
            .anyMatch((n)->n%2==0);
        System.out.println("Some even "+someEven);
                
    }
}
