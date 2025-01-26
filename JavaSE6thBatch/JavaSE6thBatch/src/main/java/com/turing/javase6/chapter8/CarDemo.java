/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */

class GasEngine extends Engine
{
    GasEngine()
    {
        System.out.println("GasEngine contructor");
    }
    
    @Override
    void start()
    {
        System.out.println("GasEngine Engine start");
    }
}
class HighTechGasEngine extends GasEngine
{
    HighTechGasEngine()
    {
        System.out.println("HighTechGasEngine contructor");
    }
    @Override
    void start()
    {
        super.start();
        System.out.println("HighTechGasEngine Engine start");
    }
}
public class CarDemo {
    public static void main(String[] args) {
        
        Engine engine = new GasEngine();
        Car car = new Car(engine);
        
        car.start();
        
    }
}
