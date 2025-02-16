/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
public class EnhancedSwitchDemo {
    static String getMonthName()
    {
        return "Jan Or Feb Or March";
    }
    public static void main(String[] args) {
        int month = 3;
        
        switch(month)
        {
            case 1,2,3:
                System.out.println("1 or 2 or 3");
                break;
            default:
                System.out.println("Others");
        }
        
        String monthName = switch(month)
        {
            case 1,2,3:
                yield "Jan Or Feb Or March";
            default:
                yield "Others";
        };
        System.out.println("Month name "+monthName);
        
        monthName = switch(month)
        {
            case 1,2,3-> "Jan Or Feb Or March";
         
            default->"Others";
        };
        System.out.println("Month name "+monthName);
        
        monthName = switch(month)
        {
            case 1,2,3-> getMonthName();
         
            default->{
                yield "Others";
            }
        };
        System.out.println("Month name "+monthName);
    }
}
