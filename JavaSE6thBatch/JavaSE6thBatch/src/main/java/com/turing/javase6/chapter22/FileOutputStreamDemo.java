/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../demo.txt");
        
        try(FileOutputStream fout = new FileOutputStream(file))
        {
            String str= "HelloWorld";
            fout.write(str.getBytes());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
