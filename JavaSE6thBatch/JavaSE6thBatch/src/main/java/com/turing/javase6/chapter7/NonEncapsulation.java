/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter7;

/**
 *
 * @author macbook
 */
//Problem
class Account
{
    private int balance;
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}
        
public class NonEncapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(300);
    }
}
