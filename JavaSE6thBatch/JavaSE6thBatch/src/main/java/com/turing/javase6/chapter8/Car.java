/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
public class Car {
    Engine engine;
    
    public Car(Engine engine)
    {
        this.engine = engine;
    }
    public void start()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
