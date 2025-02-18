/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;

/**
 *
 * @author macbook
 */
sealed class MySealedClass permits Alpha,Beta
{
    
}
final class Alpha extends MySealedClass
{
    
}
final class Beta extends MySealedClass
{
    
}
public class SealClassDemo {
    public static void main(String[] args) {
        
    }
}
