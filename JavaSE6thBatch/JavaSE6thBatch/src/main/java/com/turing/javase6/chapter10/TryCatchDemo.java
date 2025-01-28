/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class TryCatchDemo {
    static int div(int a,int b) throws Exception
    {
        if(b==0)
        {
            throw new Exception("Invalid divisor");
        }
        return a/b;
    }
    static int another()throws Exception
    {
        try
        {
            int result = div(10,0);
            return result;
        }
        catch(Exception e)
        {
            return 10;
            //throw new Exception("Rethrow");
        }
        finally
        {
            //return 100;
            throw new Exception("Rethrow");
        }
        
    }
    public static void main(String[] args) {
        
        try {
            int result = another();
            System.out.println("Result "+result);
        } catch (Exception ex) {
            System.out.println("Exception");
            ex.printStackTrace();
        }
    }
}
