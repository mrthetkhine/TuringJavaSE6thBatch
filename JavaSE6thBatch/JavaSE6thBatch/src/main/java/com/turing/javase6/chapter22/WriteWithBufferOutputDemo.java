/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class WriteWithBufferOutputDemo {
    public static void main(String[] args) {
        File file = new File("../../hello.txt");
        
        try(var bOut = new BufferedOutputStream(new FileOutputStream(file)))
        {
            char ch = 'A';
            for (int i = 0; i < 50; i++) {
                bOut.write(ch);
                ch++;
            }
            bOut.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
