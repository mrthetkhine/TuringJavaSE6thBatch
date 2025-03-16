/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.unitest;

/**
 *
 * @author macbook
 */
class Total {
    public int sum(int ... arr)
    {
        int total = 0;
        for(int item : arr)
        {
            total += item;
        }
        return total;
    }
}
