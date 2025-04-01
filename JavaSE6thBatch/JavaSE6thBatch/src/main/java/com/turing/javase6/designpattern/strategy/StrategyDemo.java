/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.strategy;

import java.util.Collections;

/**
 *
 * @author macbook
 */
public class StrategyDemo {
    public static void main(String[] args) {
       SearchAlgo algo = new SearchAlgo();
       
       algo.setStrategy(new LinearSearch());
       algo.search();
       
       algo.setStrategy(new BinarySearch());
       algo.search();
    }
}
