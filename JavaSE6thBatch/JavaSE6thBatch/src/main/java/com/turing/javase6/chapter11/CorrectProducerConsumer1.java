/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter11;

/**
 *
 * @author macbook
 */
class Queue
{
    int n;
    boolean valueSet = false;
    
    synchronized public int get()
    {
        while(!valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Interrupted exception");
            }
            System.out.println("Wait for get");
        }
        System.out.println("Got n "+n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized public void put(int n)
    {
        while( valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Interrupted exception");
            }
            System.out.println("Wait for put");
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put n "+n);
        notify();
    }
}
class Producer implements Runnable
{
    Queue queue;
    Thread thread;
    
    Producer(Queue queue)
    {
        this.queue = queue;
        this.thread  = new Thread(this,"Producer");
    }
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            this.queue.put(i++);
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
    void start()
    {
        this.thread.start();
    }
    
}
class Consumer implements Runnable
{
    Queue queue;
    Thread thread;
    
    Consumer(Queue queue)
    {
        this.queue = queue;
        this.thread  = new Thread(this,"Consumer");
    }
    @Override
    public void run() {
        
        while(true)
        {
            this.queue.get();
        }
    }
    void start()
    {
        this.thread.start();
    }
}
public class CorrectProducerConsumer1 {
    
    public static void main(String[] args) {
        
        Queue queue = new Queue();
        
        Producer producer = new Producer(queue);
        Consumer consumer =new Consumer(queue);
        
        producer.start();
        consumer.start();
    }
}
