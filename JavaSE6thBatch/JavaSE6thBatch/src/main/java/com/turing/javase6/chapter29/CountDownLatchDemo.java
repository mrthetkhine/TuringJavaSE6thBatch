/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    CountDownLatch cdLatch;
    
    MyThread(CountDownLatch cdLatch)
    {
        this.cdLatch = cdLatch;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("I "+i);
            this.cdLatch.countDown();
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdLatch = new CountDownLatch(3);
        System.out.println("Starting");
        
        MyThread th = new MyThread(cdLatch);
        th.start();
        
        try
        {
            cdLatch.await();
            System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }
}
