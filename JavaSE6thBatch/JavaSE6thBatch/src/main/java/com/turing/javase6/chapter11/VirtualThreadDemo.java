/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Task extends Thread
{
    String name;
    Task(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+this.name+" i "+i);
        }
    }
}
public class VirtualThreadDemo {
    public static void main(String[] args) {
        
        for (int i = 0; i < 100000; i++) {
            //Thread th= new Task("Task"+i);
            //th.start();
            Thread th = Thread.ofVirtual().start(new Task("Task1"));
            try {

                th.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        ExecutorService exs = Executors.newVirtualThreadPerTaskExecutor();
        
        exs.execute(new Task("Task2"));
    }
}
