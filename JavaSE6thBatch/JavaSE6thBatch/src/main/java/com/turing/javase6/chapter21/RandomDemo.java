/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.Random;

/**
 *
 * @author macbook
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Random int "+ (30+random.nextInt(21)));
        }
    }
}
