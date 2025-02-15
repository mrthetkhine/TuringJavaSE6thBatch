/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class CollectionDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        
        for(Integer item : list)
        {
            System.out.println("item "+item);
        }
        
        ArrayList rawList  = new ArrayList();
        rawList.add("String");
        rawList.add(12);
    }
}
