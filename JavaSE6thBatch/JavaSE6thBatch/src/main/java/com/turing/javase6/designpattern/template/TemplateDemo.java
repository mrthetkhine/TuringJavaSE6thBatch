/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.template;

/**
 *
 * @author macbook
 */
public class TemplateDemo {
    public static void main(String[] args) {
        FrameworkAction sale = new SaleAction();
        sale.process();
        
        FrameworkAction order = new OrderAction();
        order.process();
    }
}
