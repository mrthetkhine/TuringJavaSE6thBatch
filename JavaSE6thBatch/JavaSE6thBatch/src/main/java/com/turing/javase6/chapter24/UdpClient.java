/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UdpClient {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            String line;
            System.out.println("Enter request to send to server");
            line = scanner.next()+"\r\n";
            
            DatagramSocket socket =new DatagramSocket();
            
            byte[] buffer = line.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            
            packet.setAddress(InetAddress.getLocalHost());
            packet.setPort(9000);
            
            socket.send(packet);
            
            buffer = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(buffer,buffer.length);
            socket.receive(receivedPacket);
            
            System.out.println("Client got from server"+ (new String(receivedPacket.getData(),0,receivedPacket.getLength())));
            
        } catch (Exception ex) {
            Logger.getLogger(UdpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
