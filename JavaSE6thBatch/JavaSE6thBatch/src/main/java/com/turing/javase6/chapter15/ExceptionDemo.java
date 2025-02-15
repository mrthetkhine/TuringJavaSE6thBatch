/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
interface AccessFn
{
    int getItemAt(int index)throws CustomException;
}
public class ExceptionDemo {
    
    static int getItem(int index)throws CustomException
    {
        return 100;
    }
    public static void main(String[] args) {
        AccessFn fn= ExceptionDemo::getItem;
        try {
            System.out.println("fn "+fn.getItemAt(100));
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
    }
   
}
