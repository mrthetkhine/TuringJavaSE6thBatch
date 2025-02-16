/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.Optional;

/**
 *
 * @author macbook
 */
public class OptionalDemo {
    static Integer findBySomethingV1(int id)
    {
        if(id==0)
        {
            return null;
        }
        return id;
    }
    static Optional<Integer> findBySomething(int id)
    {
        if(id==0)
        {
            return Optional.empty();
        }
        return Optional.of(id);
    }
    public static void main(String[] args) {
        
        /*
        Integer result= findBySomethingV1(0);
        if(result != null)
        {
            Integer result2 = findBySomethingV1(result+1);
            System.out.println("Result2 "+result2);
            
            
        }
        */ 
        findBySomething(1)
                .map(x->x+1)
                .map(x->x*2)
                .stream()
                .forEach(System.out::println);
    }
}
