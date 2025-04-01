/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.flyweight.facade;

/**
 *
 * @author macbook
 */
public class WithoutFacade {
    ApiOne apiOne = new ApiOne();
    ApiTwo apiTwo = new ApiTwo();
    
    void process()
    {
        apiOne.apiOne();
        apiTwo.apiTwo();
    }
    public static void main(String[] args) {
        WithoutFacade without = new WithoutFacade();
        without.process();
    }
}
