/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class ReadFileByChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        
        try( SeekableByteChannel bytChannel = Files.newByteChannel(path))
        {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            
            int count ;
            do
            {
                count = bytChannel.read(buffer);
                if(count != -1)
                {
                    buffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)buffer.get());
                    }
                }
            }while(count!=-1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
