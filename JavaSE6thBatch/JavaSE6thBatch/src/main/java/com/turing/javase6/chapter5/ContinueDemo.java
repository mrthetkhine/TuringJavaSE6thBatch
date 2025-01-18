/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter5;

/**
 *
 * @author macbook
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5)
            {
                //continue;
               //break;
                return;
            }
            System.out.println("i "+i);
           
        }
        System.out.println("End of loop");
    }
}
