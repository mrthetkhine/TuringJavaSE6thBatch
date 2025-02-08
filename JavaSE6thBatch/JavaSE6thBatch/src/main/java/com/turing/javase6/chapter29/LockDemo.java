/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author macbook
 */
class Data
{
    int value;
}
class IncThread extends Thread
{
    Lock lock;
    Data data;
    IncThread(Lock lock,Data data)
    {
        this.lock = lock;
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            
            this.lock.lock();
            
            this.data.value ++;
            
            this.lock.unlock();
        }
    }
}
public class LockDemo {
    public static void main(String[] args) {
        Data data =new Data();
        Lock lock = new ReentrantLock();
        
        IncThread t1 = new IncThread(lock,data);
        IncThread t2 = new IncThread(lock,data);
        IncThread t3 = new IncThread(lock,data);
        
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
