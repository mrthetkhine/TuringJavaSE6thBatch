/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter11;

/**
 *
 * @author macbook
 */
class PrintThread extends Thread
{
    String name;
    PrintThread(String name)
    {
        super(name);
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+this.name+" i => "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        
        System.out.println("CPU "+cores);
        PrintThread t1 =new PrintThread("One");
        PrintThread t2 =new PrintThread("Two");
        PrintThread t3 =new PrintThread("Three");
        
        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Main Thread"+Thread.currentThread().getName());
    }
}
