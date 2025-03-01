/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author macbook
 */
public class WhoIsServerDemo {
    public static void main(String[] args) {
        
        try
        {
            Socket socket = new Socket("whois.internic.net",43);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String domain = "www.google.com";
            out.write(domain.getBytes());
            out.flush();
            int c ;
            while ( (c =in.read())!=-1)
            {
                System.out.print((char)c);
            }
            in.close();
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
