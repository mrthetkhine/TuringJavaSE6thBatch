/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class EchoClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter a line to send to server");
            String line = scanner.nextLine()+"\r\n";
            Socket socket =new Socket("localhost",9000);
            
            try(
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    OutputStream out = socket.getOutputStream())
            {
                out.write(line.getBytes());
                String response = in.readLine();
                System.out.println("Response ===>"+response);
            }
            catch(Exception ie)
            {
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
