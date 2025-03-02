/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class ReadFileUtil
{
    public static String readFile(String url)
    {
        String contents = "";
        try {
            Path path = Path.of("../../WebServerRoot/"+url);
            System.out.println("Path "+path);
            contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            System.out.println("Contents "+contents);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contents;
    }
}
class HttpClientHandler extends Thread
{
    Socket client;
    HttpClientHandler(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try(
                DataInputStream in = new DataInputStream(this.client.getInputStream());
                OutputStream out = this.client.getOutputStream())
        {
            String statusLine = in.readLine();
            String lines[] = statusLine.split(" ");
            String url = lines[1];
            System.out.println("Request form client from port "+
                    this.client.getPort()+" "+ statusLine );
            System.out.println("Url "+url);
            
            
            String body;
            if(url.endsWith(".html"))
            {
                body = ReadFileUtil.readFile(url);
            }
            else
            {
                body = "<html><h1>Hello from our server</h1><html>\r\n";
            }
           
            String httpResponse = "HTTP/1.1 200 OK\r\n"
                        +"Content-Type: text/html\r\n"
                        +"Content-Length: "+body.length()+"\r\n"
                        +"Connection: Closed\r\n"
                        +"\r\n"
                        +body;
             
            
            
           
            out.write(httpResponse.getBytes());
            out.flush();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class HttpServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server listend at 8080");
            while(true)
            {
                Socket socket = serverSocket.accept();
                
                System.out.println("Client connected "+socket.getPort());
                new HttpClientHandler(socket).start();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
