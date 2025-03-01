/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class ReadFileInputStreamDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        
        try( InputStream fin = Files.newInputStream(path))
        {
        
            int data ;
            do
            {
                data = fin.read();
                if(data != -1)
                {
                    System.out.print((char)data);
                }
            }while(data!=-1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
