/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;


/**
 *
 * @author macbook
 */
enum Gender
{
    Male,Female;
}
public class GenderWithEnum {
    public static void main(String[] args) {
        Gender gender = Gender.Male;
        System.out.println("Gender "+gender);
        
        gender = Gender.Female;
        
        if(gender == Gender.Male)
        {
            System.out.println("Male ");
        }
        else if(gender == Gender.Female)
        {
            System.out.println("Female");
        }
        for(Gender g : Gender.values())
        {
            System.out.println("G "+g);
        }
        gender = Gender.valueOf("Male");
        System.out.println("Gender "+gender);
        
        int result =  Gender.Male.compareTo(Gender.Female);
        System.out.println("Result "+result);
        
        result =  Gender.Male.compareTo(Gender.Male);
        System.out.println("Result "+result);
        
        result =  Gender.Female.compareTo(Gender.Male);
        System.out.println("Result "+result);
        
    }
}
