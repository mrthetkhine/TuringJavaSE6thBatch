/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.cor;

/**
 *
 * @author macbook
 */
public class AuthHandler extends Handler{

    @Override
    void handle(Request request) {
        System.out.println("AuthHandler "+request.url);
        if(request.headers.containsKey("Authorization") && this.next!=null)
        {
            this.next.handle(request);
        }
    }
    
}
