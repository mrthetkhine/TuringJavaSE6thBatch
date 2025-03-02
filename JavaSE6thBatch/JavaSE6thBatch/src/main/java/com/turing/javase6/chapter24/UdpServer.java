/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UdpServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket =new DatagramSocket(9000);
            while(true)
            {
                byte[] buffer =new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
                serverSocket.receive(packet);
                
                System.out.println("Server got "+ (new String(packet.getData(),0,packet.getLength())));
                
                String response = "Response from server"+(new Date()) +"\r\n";
                byte[] responseBuffer = response.getBytes();
                DatagramPacket packetResponse = new DatagramPacket(responseBuffer,responseBuffer.length);
                
                packetResponse.setAddress(InetAddress.getLocalHost());
                packetResponse.setPort(packet.getPort());
                
                serverSocket.send(packetResponse);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
