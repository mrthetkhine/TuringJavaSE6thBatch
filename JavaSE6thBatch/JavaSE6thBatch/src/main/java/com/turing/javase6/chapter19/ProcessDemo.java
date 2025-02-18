/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter19;

import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author macbook
 */
public class ProcessDemo {
    public static void main(String[] args) {
      
        Process p = null;
        
        try
        {
            //p =  Runtime.getRuntime().exec("mkdir hello");
            p = Runtime.getRuntime().exec(new String[]{"ls"});
            try(InputStream in = p.getInputStream())
            {
                
                int data = in.read();
                while(data != -1)
                {
                    System.out.print((char)data);
                    data = in.read();
                }
            }
            catch(Exception e)
            {
            }
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }
}
