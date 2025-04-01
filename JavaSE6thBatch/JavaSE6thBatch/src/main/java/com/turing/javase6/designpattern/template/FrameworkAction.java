/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.template;

/**
 *
 * @author macbook
 */
public abstract class FrameworkAction {
    void logging()
    {
        System.out.println("Logging");
    }
    void security()
    {
        System.out.println("Security");
    }
    abstract void buinessLogic();
    
    void process()
    {
        this.logging();
        this.security();
        this.buinessLogic();
    }
            
}
