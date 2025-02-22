/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter19;

/**
 *
 * @author macbook
 */
public class MathDemo {
    static double degreeToRadian(int degree)
    {
        return degree* Math.PI/180;
    }
    public static void main(String[] args) {
        System.out.println("Sin 90 "+Math.sin(degreeToRadian(90)));
    }
}
