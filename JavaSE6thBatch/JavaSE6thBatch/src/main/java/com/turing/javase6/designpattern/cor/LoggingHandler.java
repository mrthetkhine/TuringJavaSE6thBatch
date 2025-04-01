/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.cor;

/**
 *
 * @author macbook
 */
public class LoggingHandler extends Handler{

    @Override
    void handle(Request request) {
        System.out.println("Logger "+request.url);
        if(this.next != null)
        {
            this.next.handle(request);
        }
    }
    
}
