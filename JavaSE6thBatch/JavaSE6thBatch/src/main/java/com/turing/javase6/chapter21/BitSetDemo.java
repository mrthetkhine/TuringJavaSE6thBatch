/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.BitSet;

/**
 *
 * @author macbook
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(10);
        bitSet.set(0);
        bitSet.set(8);
        System.out.println("Bit Set "+bitSet);
    }
}
