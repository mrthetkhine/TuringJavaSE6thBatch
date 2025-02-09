/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
interface GenderConstants
{
    int MALE =0;
    int FEMALE =1;
}
public class WhyEnum {
    public static void main(String[] args) {
        int gender = GenderConstants.MALE;
        gender = GenderConstants.FEMALE;
        
        System.out.println("Gender "+gender);
        gender = 100;
        
        
        
    }
}
