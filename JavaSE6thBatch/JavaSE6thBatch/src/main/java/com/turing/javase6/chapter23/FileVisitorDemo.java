/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter23;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author macbook
 */
class MyFileVisitor extends SimpleFileVisitor<Path>
{
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr)
            throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class FileVisitorDemo {
    public static void main(String[] args) {
        Path path = Path.of("../../");
        try
        {
            Files.walkFileTree(path, new MyFileVisitor());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
