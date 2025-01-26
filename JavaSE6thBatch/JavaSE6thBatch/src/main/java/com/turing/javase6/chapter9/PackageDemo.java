/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter9;

import com.turing.javase6.chapter8.Car;
import com.turing.javase6.chapter8.DieselEngine;
import com.turing.javase6.chapter8.Engine;
import java.util.Date;

//import java.lang.String;


/**
 *
 * @author macbook
 */
public class PackageDemo {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        
        car.start();
        
        Date d = new Date();
        System.out.println("Date "+d);
    }
}
