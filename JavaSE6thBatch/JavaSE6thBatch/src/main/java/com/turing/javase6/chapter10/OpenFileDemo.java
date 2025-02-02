/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

import java.io.DataInputStream;
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
public class OpenFileDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/turing/javase6/chapter10/OpenFileDemo.java");
        /*
        DataInputStream din = null;
        try {
            System.out.println("Path "+file.getAbsolutePath());
            din = new DataInputStream(new FileInputStream(file));
        } catch (FileNotFoundException ex) {
            System.out.println("Ex "+ex.getMessage());
        }
        finally{
            if(din !=null)
            {
                try {
                    din.close();
                } catch (IOException ex) {
                    System.out.println("Ex "+ex.getMessage());
                }
            }
        }*/
        try(DataInputStream din = new DataInputStream(new FileInputStream(file)))
        {
        }
        catch(Exception e)
        {
            
        }
        
    }
}
