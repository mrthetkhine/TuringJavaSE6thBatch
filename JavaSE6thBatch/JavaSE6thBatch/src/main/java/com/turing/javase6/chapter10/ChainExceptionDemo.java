/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

/**
 *
 * @author macbook
 */
public class ChainExceptionDemo {
    static void process()
    {
        NullPointerException ne = new NullPointerException("Custom NE");
        ne.initCause(new Exception("Another root cause"));
        
        throw ne;
        
    }
    public static void main(String[] args) {
        
        try
        {
            process();
        }
        catch(Exception e)
        {
            System.out.println("E.message "+e.getMessage());
            System.out.println("E.getCause "+e.getCause());
        }
    }
}
