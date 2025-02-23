/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author macbook
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        
        map.put(1, "Apple");
        map.put(2,"Banana");
        
        System.out.println("Map get "+map.get(1));
        map.put(2, "Orange");
        map.put(3, "Fish");
        
        System.out.println("Map get 2 "+map.get(2));
        
        for(String value: map.values())
        {
            System.out.println("Values "+value);
        }
        map.remove(3);
        for(Integer key : map.keySet())
        {
            System.out.println("Key "+key);
        }
        for(Entry<Integer,String> keyValues : map.entrySet())
        {
            System.out.println("Key "+keyValues.getKey() +" Value "+keyValues.getValue());
        }
    }
}
