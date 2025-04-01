/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.cor;

/**
 *
 * @author macbook
 */
public abstract class Handler {
    Handler next;
    
    public void setNext(Handler next)
    {
        this.next = next;
    }
    abstract void handle(Request request);
}
