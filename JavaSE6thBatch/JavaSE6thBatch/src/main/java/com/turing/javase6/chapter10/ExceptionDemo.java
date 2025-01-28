/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

/**
 *
 * @author macbook
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        
        System.out.println("Dividing 10/0");
        
        String str = null;
        try
        {
            int result = 10/2;
            System.out.println("Result "+result);
            System.out.println("Null "+str.toLowerCase());
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception happen there is problem in divisor "+ae.getMessage());
            
        }
        /*
        catch(NullPointerException ne)
        {
            System.out.println("Nullpointer exception");
        }*/
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
        finally
        {
            System.out.println("Finally Always run");
        }
        System.out.println("Done");
       
        
    }
}
