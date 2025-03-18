/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.singleton;

/**
 *
 * @author macbook
 */
public  class Singleton
{
    private static Singleton instance ;//= new Singleton();
    private Singleton()
    {
        
    }
    public static Singleton getSingleton()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}