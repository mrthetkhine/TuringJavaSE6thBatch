/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author macbook
 */
public class UrlDemo {
    public static void main(String[] args) {
        
        try
        {
            URL url = new URI("https://www.google.com/index.html").toURL();
            System.out.println("Protcol "+url.getProtocol());
            System.out.println("Path "+url.getPath());
            System.out.println("Port "+url.getPort());
            System.out.println("File "+url.getFile());
            System.out.println("External form "+url.toExternalForm());
            URLConnection conn = url.openConnection();
            
            System.out.println("Content length "+conn.getContentLength());
            System.out.println("Content Type "+conn.getContentType());    
            System.out.println("Content "+conn.getContent());
            
            InputStream in = conn.getInputStream();
            int data ;
            while ((data=in.read())!=-1)
            {
                System.out.print((char)data);
            }
            in.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
