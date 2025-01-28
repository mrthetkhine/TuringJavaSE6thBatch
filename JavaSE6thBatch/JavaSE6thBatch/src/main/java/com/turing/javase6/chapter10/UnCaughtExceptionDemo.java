/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author macbook
 */
public class UnCaughtExceptionDemo {
    public static void main(String[] args) {
        
        try
        {
            int []arr = {1,2,3};
            int result = arr[3];
            System.out.println("Result "+result);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array Exception ");
            ae.printStackTrace();
        }
        
        
        //InputStream in = new InputStream(new FileInputStream(new File("demo.java")));
    }
}
