/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.ByteArrayInputStream;

/**
 *
 * @author macbook
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String str = "HelloWorld";
        byte []bytes = str.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        
        for (int i = 0; i < bytes.length; i++) {
            int data = bin.read();
            if(data != -1)
            {
                System.out.print((char)data);
            }
        }
        bin.reset();
    }
}
