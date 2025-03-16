/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.oodesign.principle;

/**
 *
 * @author macbook
 */
class TightCar
{
    TightEngine engine = new TightEngine();
    void start()
    {
        System.out.println("car start");
        this.engine.start();
    }
}
class TightEngine
{
    public void start()
    {
        System.out.println("Engine start");
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        TightCar car = new TightCar();
        car.start();
    }
}
