/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.factory;

/**
 *
 * @author macbook
 */
public class OracleConnection implements Connection {

    @Override
    public void open() {
        System.out.println("Oracle Connection open");
    }
    
}
