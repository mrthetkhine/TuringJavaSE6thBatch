/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

import com.turing.javase6.chapter17.Id.Type;

/**
 *
 * @author macbook
 */
record Employee(String name,Id id){};
record Id(int idNum,Type type)
{
    enum Type{
        FullTime,PartTime
    }
}

public class PatternMatchingWithRecord {
    public static void main(String[] args) {
        Object emp= new Employee("TK",new Id(1,Type.FullTime));
        
        if( emp instanceof Employee employee)
        {
            System.out.println("Name "+employee.name());
            System.out.println("Id "+employee.id().idNum());
            System.out.println("Type "+employee.id().type());
        }
    }
}
