/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.factory;

/**
 *
 * @author macbook
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ConnectionFactory factory = new OracleFactory();
        Connection conn = factory.createConnection();
        conn.open();
    }
}
