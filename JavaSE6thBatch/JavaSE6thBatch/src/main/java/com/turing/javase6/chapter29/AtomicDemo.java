/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author macbook
 */
class AtomicData
{
    AtomicInteger value = new AtomicInteger();
}
class IncThreadWithAtomicData extends Thread
{
    AtomicData data;
    IncThreadWithAtomicData(AtomicData data)
    {
     
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            
            this.data.value.getAndIncrement();
           
        }
    }
}
public class AtomicDemo {
    public static void main(String[] args) {
        AtomicData data =new AtomicData();
      
        
        IncThreadWithAtomicData t1 = new IncThreadWithAtomicData(data);
        IncThreadWithAtomicData t2 = new IncThreadWithAtomicData(data);
        IncThreadWithAtomicData t3 = new IncThreadWithAtomicData(data);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Data value "+data.value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
