/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class WriteWithBufferOutputStreamDemo {
    public static void main(String[] args) {
        Path path = Path.of("../../nio3.txt");
        
        try(BufferedOutputStream bOut = new BufferedOutputStream(Files.newOutputStream(path)))
        {
          
            for (int i = 0; i < 26; i++) {
                bOut.write((byte)('A'+i));
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
