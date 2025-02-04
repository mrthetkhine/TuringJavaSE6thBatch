/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
class Queue
{
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);
    
    public void get()
    {
        try
        {
            semCon.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Got n "+n); 
        semProd.release();
    }
    public void put(int n)
    {
        try
        {
            semProd.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Put "+n);
        semCon.release();
    }
}
class Producer extends Thread
{
    Queue queue;
    Producer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            this.queue.put(i);
        }
    }
}
class Consumer extends Thread
{
    Queue queue;
    Consumer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            this.queue.get();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer prod  = new Producer(queue);
        Consumer con = new Consumer(queue);
       
        con.start();
        prod.start();
    }
}
