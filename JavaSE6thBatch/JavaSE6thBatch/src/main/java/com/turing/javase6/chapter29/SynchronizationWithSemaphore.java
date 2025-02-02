/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import com.turing.javase6.chapter11.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Data
{
    int value = 0;
}
class IncThread extends Thread
{
    Data data;
    Semaphore semaphore;
    IncThread(Data data,Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }
    public void run()
    {
        for (int i = 0; i < 100_000; i++) {
            try {
                this.semaphore.acquire();
                
                data.value ++;
                
                this.semaphore.release();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    }
}
public class SynchronizationWithSemaphore {
    public static void main(String[] args) {
        
        Data data = new Data();
       
        Semaphore sem = new Semaphore(1);
        
        IncThread t1 = new IncThread(data,sem);
        IncThread t2 = new IncThread(data,sem);
        IncThread t3 = new IncThread(data,sem);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Data "+data.value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
