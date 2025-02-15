/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

/**
 *
 * @author macbook
 */
interface Factory
{
    Human build(String name);
}
class Human
{
    String name;
    public Human(String name)
    {
        this.name = name;
        System.out.println("Human Constructor");
    }
}
class Teacher extends Human
{
    public Teacher(String name)
    {
        super(name);
         System.out.println("Teacher Constructor");
    }
}
class Doctor extends Human
{
    public Doctor(String name)
    {
        super(name);
        System.out.println("Doctor Constructor");
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        Factory factory = Human::new;
        
        Human h = factory.build("Human");
        factory = Doctor::new;
        
        h = factory.build("Dr Someone");
        
        
    }
}
