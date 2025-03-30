/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.decorator;

/**
 *
 * @author macbook
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        MoteHinGar m = new WithBaeOu(new WithNanNanPin (new WithPaeThee(new PlainMoeHinGar())));
        System.out.println(m.prepare());
    }
}
