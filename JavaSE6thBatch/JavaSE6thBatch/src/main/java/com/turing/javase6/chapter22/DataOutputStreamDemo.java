/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../data.bin");
        try(var dOut = new DataOutputStream(new FileOutputStream(file))) {
            
            dOut.writeInt(10);
            dOut.writeDouble(20.0);
            dOut.writeUTF("Hello World");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
