/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class VarArgs {
    
    static int min(String message,int ... values)
    {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if(minValue< values[i])
            {
                minValue = values[i];
            }
        }
        return minValue;
    }
            
    public static void main(String[] args) {
        System.out.println("Min "+ min("Min ",2,3,6,1));
        System.out.println("Min "+ min("Message",2,3,6,1,19,-2));
        
        var myStr = "This is a string";
        
        var list = new ArrayList<String>();
        list.add("Hello");
        
        System.out.println("List "+list.get(0));
        System.out.println("Size "+list.size());
    }
}
