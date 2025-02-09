/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase6/chapter13/ScannerDemo.java");
        System.out.println("File "+file.getAbsolutePath());
        try(FileInputStream fin = new FileInputStream(file))
        {   
           int i;
           do 
           {
               i = fin.read();
               if( i != -1)//Not EOF
               {
                   System.out.print((char)i);
               }
           }while (i != -1);
           
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
}
