/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class WriteFileWithMappedBuffer {
    public static void main(String[] args) {
        Path path = Path.of("../../nio2.txt");
        
        try(FileChannel channel = (FileChannel)Files.newByteChannel(path,
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE))
        {
           MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte)('A'+i));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
