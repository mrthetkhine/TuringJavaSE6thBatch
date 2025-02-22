/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.Stack;

/**
 *
 * @author macbook
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Peek "+stack.peek());
        
        System.out.println("Size "+stack.size());
        System.out.println("Empty "+stack.isEmpty());
    }
}
