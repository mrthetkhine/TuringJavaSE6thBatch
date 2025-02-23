/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author macbook
 */
public class StringTokenizerDemo {
    
    public static Map<String,String> parseCSV(String csvStr)
    {
        
        Map<String,String> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(csvStr, ";");
        while(tokenizer.hasMoreTokens())
        {
            String token= tokenizer.nextToken();
            System.out.println("Token "+token);
            String keyValues[] = token.split("=");
            String key = keyValues[0];
            String value = keyValues[1];
            //System.out.println("Key "+key + " Value "+value);
            map.put(key, value);
                    
        }
        return map;
    }
    public static void main(String[] args) {
        String str = "I go to shcool";
        String[]arr = str.split(" ");
        
        for(String item: arr)
        {
            System.out.println("Item "+item);
        }
        String csvStr = "name=Java;author=Someone";
        
        Map<String,String> map = parseCSV(csvStr);
        
        System.out.println("Name "+map.get("name"));
        System.out.println("Author "+map.get("author"));
    }
}
