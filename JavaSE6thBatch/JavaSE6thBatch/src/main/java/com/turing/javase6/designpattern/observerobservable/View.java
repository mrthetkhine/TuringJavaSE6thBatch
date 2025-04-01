/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.observerobservable;

/**
 *
 * @author macbook
 */
public class View implements Subscriber{

    String name;
    public View(String name)
    {
        this.name=name;
    }
    @Override
    public void update(String data) {
        System.out.println("View "+this.name+ " got update "+data);
    }
    
}
