/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter9;

/**
 *
 * @author macbook
 */
interface A
{
    void methodA();
}
interface B
{
    void methodB();
}
interface C extends A,B
{
    void methodC();
}
interface D
{
    void methodC();
    void methodD();
}
class MyClass implements C,D
{

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodC() {
        System.out.println("Method C");
    }
     @Override
    public void methodD() {
        System.out.println("Method D");
    }
}
public class InterfaceInheritance {
    
}
