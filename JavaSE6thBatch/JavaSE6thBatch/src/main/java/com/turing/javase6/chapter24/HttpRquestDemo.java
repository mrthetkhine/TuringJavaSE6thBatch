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
public class HttpRquestDemo {
    public static void main(String[] args) {
        
        try
        {
            Socket socket = new Socket("www.google.com",80);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String httpRequest = "GET / HTTP/1.1\r\n\r\n";
            out.write(httpRequest.getBytes());
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
