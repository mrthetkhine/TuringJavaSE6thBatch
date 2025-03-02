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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class EchoHandler extends Thread
{
    Socket client;
    EchoHandler(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try(
                DataInputStream in = new DataInputStream(this.client.getInputStream());
                OutputStream out = this.client.getOutputStream())
        {
            String request = in.readLine();
            System.out.println("Request form client from port "+
                    this.client.getPort()+" "+ request );
            String date = "Echo from server -->"+request.toUpperCase()+"\r\n";
            out.write(date.getBytes());
            out.flush();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server listend at 9000");
            while(true)
            {
                Socket socket = serverSocket.accept();
                
                System.out.println("Client connected "+socket.getPort());
                new EchoHandler(socket).start();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
