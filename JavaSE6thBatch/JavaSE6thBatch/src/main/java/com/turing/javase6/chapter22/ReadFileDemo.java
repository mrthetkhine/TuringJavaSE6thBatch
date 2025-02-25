/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author macbook
 */
public class ReadFileDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        
        try(var fin = new FileInputStream(file))
        {
            int size = fin.available();
            
            int n = size/40;
            
            for (int i = 0; i < n; i++) {
                System.out.print((char)fin.read());
            }
            System.out.println("Available "+fin.available());
            byte bytes[] = new byte[n];
            if ( fin.read(bytes) != n)
            {
                System.out.println("Cannot read");
            }
            String str = new String(bytes);
            System.out.println(str);
            
            fin.skip(40);
            int ch;
            while ((ch= fin.read())!=-1) {
                System.out.print((char)ch);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
