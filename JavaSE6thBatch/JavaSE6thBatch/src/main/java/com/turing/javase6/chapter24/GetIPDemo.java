/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class GetIPDemo {
    public static void main(String[] args) {
        String host = "www.google.com";
        
        InetAddress[] ipAddress;
        try {
            InetAddress address = InetAddress.getByName("localhost");
            System.out.println("Single "+address);
            System.out.println("Localhsot "+InetAddress.getLocalHost());
            
            ipAddress = InetAddress.getAllByName(host);
            for(InetAddress ip : ipAddress)
            {
                System.out.println("IP "+ip);
                System.out.println("HostName "+ip.getHostName());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        
    }
}
