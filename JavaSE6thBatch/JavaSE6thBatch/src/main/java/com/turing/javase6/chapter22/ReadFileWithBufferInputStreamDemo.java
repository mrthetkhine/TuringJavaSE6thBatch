/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author macbook
 */
public class ReadFileWithBufferInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        
        try(var bin = new BufferedInputStream(new FileInputStream(file)))
        {
            int ch;
            bin.mark(10);
            while ( (ch=bin.read())!= -1)
            {
                System.out.print((char)ch);
            }
            
            bin.reset();
            byte[] bytes = new byte[10];
            bin.read(bytes);
            
            String str = new String(bytes);
            System.out.println("Bytes "+str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
