/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../obj.bin");
        
        Human h = new Human("Somone",13,"YGN");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file)))
        {
            out.writeObject(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
