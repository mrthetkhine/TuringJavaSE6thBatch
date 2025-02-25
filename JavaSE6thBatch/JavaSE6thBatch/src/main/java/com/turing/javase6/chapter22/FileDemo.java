/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;

/**
 *
 * @author macbook
 */
public class FileDemo {
    public static void printDir(String dir)
    {
        File file = new File(dir);
        if(file.isDirectory())
        {
            for(File f : file.listFiles())
            {
                printDir(f.getAbsolutePath());
            }
        }
        else
        {
            System.out.println(file.getAbsolutePath());
        }
        
    }
    public static void main(String[] args) {
        File file = new File("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        File directory = new File("src/main/java/com/turing/javase6/chapter22");
        
        System.out.println("isFile "+file.isFile());
        System.out.println("Directory "+directory.isDirectory());
        
        System.out.println("File isexist "+file.exists());
        System.out.println("Name "+file.getName());
        System.out.println("Path "+file.getPath());
        System.out.println("Absolute Path  "+file.getAbsolutePath());
        System.out.println("Parent "+file.getParent());
        System.out.println("File size "+file.length());
        
        printDir("src/main/java/com/turing");
        
        
    }
}
