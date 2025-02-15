/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

/**
 *
 * @author macbook
 */
interface MyFunc
{
    int process();
}
public class VariableCapture {
    public static void main(String[] args) {
        
        int counter =0;
        MyFunc func = ()->{
            //counter++;
            return counter +1;
        };
        //counter = 200;
        System.out.println("FUnc "+func.process());
    }
}
