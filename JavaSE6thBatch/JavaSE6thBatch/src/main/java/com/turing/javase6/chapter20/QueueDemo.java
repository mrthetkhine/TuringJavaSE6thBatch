/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println("Take "+queue.poll());
        System.out.println("Take "+queue.poll());
        System.out.println("Take "+queue.poll());
    }
}
