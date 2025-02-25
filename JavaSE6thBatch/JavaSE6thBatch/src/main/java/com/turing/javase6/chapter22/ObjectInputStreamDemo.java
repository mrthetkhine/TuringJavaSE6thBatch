/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../obj.bin");
        
        Human h;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
        {
            h = (Human)in.readObject();
            System.out.println("H "+h.name+ " Age "+h.age + " Address "+h.address);
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
