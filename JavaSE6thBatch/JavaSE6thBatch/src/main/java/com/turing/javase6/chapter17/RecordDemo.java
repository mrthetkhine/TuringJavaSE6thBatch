/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
public class RecordDemo {
    public static void main(String[] args) {
        HumanRecord rec = new HumanRecord(" TK ",40);
        System.out.println("Name "+rec.name()+"<<");
        System.out.println("Age "+rec.age());
        
        
        HumanRecord rec2 = new HumanRecord("TK ");
        System.out.println("Name "+rec2.nameInUpperCase() +"<<");
        
    }
}
