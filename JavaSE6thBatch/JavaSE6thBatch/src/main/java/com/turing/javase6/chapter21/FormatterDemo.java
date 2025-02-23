/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author macbook
 */
public class FormatterDemo {
    public static void main(String[] args) {
       Calendar calendar = Calendar.getInstance();
       Formatter formatter = new Formatter();
       
       formatter.format("%tr", calendar);
       System.out.println("Date "+formatter);
       formatter.close();
       
       formatter =new Formatter();
       formatter.format("Fomatting is easy %s Digit %.2f", "Java", 13.4);
       System.out.println("Str "+formatter);
       formatter.close();
    }
}
