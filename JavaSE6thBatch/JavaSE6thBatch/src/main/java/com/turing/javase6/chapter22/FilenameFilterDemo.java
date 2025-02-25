/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author macbook
 */
class OnlyExt implements FilenameFilter
{
    String ext ;
    public OnlyExt(String ext)
    {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }
    
}
public class FilenameFilterDemo {
    public static void main(String[] args) {
        File directory = new File("../../");
        OnlyExt javaOnly = new OnlyExt("java");
        for(File f : directory.listFiles(javaOnly))
        {
            System.out.println("File "+f.getAbsolutePath());
        }
        
        File newDir =  new File("../../another");
        newDir.mkdir();
    }
}
