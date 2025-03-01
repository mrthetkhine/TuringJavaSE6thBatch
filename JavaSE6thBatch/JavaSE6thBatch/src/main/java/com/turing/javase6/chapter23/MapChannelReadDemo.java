/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class MapChannelReadDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/com/turing/javase6/chapter22/FileDemo.java");
        try(FileChannel fChannel =(FileChannel)Files.newByteChannel(path))
        {
            long fSize = fChannel.size();
            MappedByteBuffer buffer = fChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            
            for (int i =0; i < fSize; i++) {
                System.out.print((char)buffer.get());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
