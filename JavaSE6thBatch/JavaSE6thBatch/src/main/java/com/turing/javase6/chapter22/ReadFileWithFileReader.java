/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 *
 * @author macbook
 */
public class ReadFileWithFileReader {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        
        try(var fin = new FileReader(file))
        {
            int ch ;
            while ( (ch=fin.read())!=-1)
            {
                System.out.print((char)ch);   
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
