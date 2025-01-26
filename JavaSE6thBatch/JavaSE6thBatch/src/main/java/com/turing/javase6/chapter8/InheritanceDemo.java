/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Human h = new Doctor("Dr SOmeone",30,"OG");
        //h.eat();
        h.work();
        
        h = new Teacher("Daw Hla",50,"Math");
        //h.eat();
        h.work();
        
        h = new Human("Oridinary One",40);
        //h.eat();
        h.work();
        
        
    }
}
