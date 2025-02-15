/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter15;

/**
 *
 * @author macbook
 */
interface GenOp<T>
{
    T getItem(T[]arr,int index);
}
public class GenericMethodRef {
    static int getInt(Integer[]arr,int index)
    {
        return arr[index];
    }
    static String getString(String[]arr,int index)
    {
        return arr[index];
    }
    public static void main(String[] args) {
        GenOp<Integer> intOp = GenericMethodRef::getInt;
        GenOp<String> strOp = GenericMethodRef::getString;
        
        Integer[] arr = {1,2,3};
        System.out.println("intOp "+ intOp.getItem(arr,1));
    }
}
