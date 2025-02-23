/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.Optional;

/**
 *
 * @author macbook
 */
public class OptionalDemo {
    public static String toUpper(String str)
    {
        return str.toUpperCase();
    }
    public static String appendHi(String str)
    {
        return str+ " hi";
    }
    public static void main(String[] args) {
        
        /*
        String data = null;
        String result = toUpper(data);
        result = appendHi(result);
        
        System.out.println("Result "+result);
        */
        String data = "hello";
        String result = Optional.ofNullable(data)
                .map(OptionalDemo::toUpper)
                .map(OptionalDemo::appendHi)
                .orElse("default string");
        System.out.println("Result "+result);
    }
}
