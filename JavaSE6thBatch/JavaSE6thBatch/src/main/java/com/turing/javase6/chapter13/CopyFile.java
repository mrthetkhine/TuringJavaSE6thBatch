/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class CopyFile {
    public static void main(String[] args) {
        File inputFile = new File("./src/main/java/com/turing/javase6/chapter13/ScannerDemo.java");
        File outputFile = new File("./Output.txt");
        System.out.println("File "+inputFile.getAbsolutePath());
        try(var fin = new FileInputStream(inputFile);
            var fout = new FileOutputStream(outputFile))
        {   
           int i;
           do 
           {
               i = fin.read();
               if( i != -1)//Not EOF
               {
                   System.out.print((char)i);
                   fout.write(i);
               }
           }while (i != -1);
           
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
}
