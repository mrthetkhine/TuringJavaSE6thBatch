/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.oodesign.principle;

/**
 *
 * @author macbook
 */
class Car
{
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
class Engine
{
    public void start()
    {
        System.out.println("Engine start");
    }
}
class DieselEngine extends Engine
{
    public void start()
    {
        System.out.println("DieselEngine start");
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.start();
    }
}
