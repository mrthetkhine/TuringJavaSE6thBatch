/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../data.bin");
        try(var dIn = new DataInputStream(new FileInputStream(file))) {
            
            int intData = dIn.readInt();
            //int intData = 0;
            double doubleData = dIn.readDouble();
            String str = dIn.readUTF();
            System.out.println("Int Data "+intData + " double "+doubleData+" str "+str);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
