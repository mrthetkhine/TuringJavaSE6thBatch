/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

/**
 *
 * @author macbook
 */
public class Human {
    @NotNull
    String name;
    
    @NotNull(message="Address must not null")
    String address;
    
    //@NotNull
    String biography;
}
