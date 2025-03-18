/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.singleton;

import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton another = Singleton.getSingleton();
        
        //new Singleton();
        System.out.println("Singleton "+(singleton == another));
        
        Toolkit tk1 = Toolkit.getDefaultToolkit();
        Toolkit tk2 = Toolkit.getDefaultToolkit();
        
        System.out.println("Toolkit "+(tk1==tk2));
        
        Runtime rt1 = Runtime.getRuntime();
        Runtime rt2 = Runtime.getRuntime();
        System.out.println("Rt1 == rt2 "+(rt1==rt2));
    }
}
