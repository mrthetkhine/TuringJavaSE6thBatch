/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.cor;

import java.util.HashMap;

/**
 *
 * @author macbook
 */
public class Request {
    String url;
    public Request(String url)
    {
        this.url = url;
    }
    HashMap<String,String> headers = new HashMap<String,String>();
    
    void addHeader(String key,String value)
    {
        this.headers.put(key, value);
    }
}
