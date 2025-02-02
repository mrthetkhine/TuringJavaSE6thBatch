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
    
    synchronized public int get()
    {
        System.out.println("Got n "+n);
        return n;
    }
    synchronized public void put(int n)
    {
        this.n = n;
        System.out.println("Put n "+n);
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
public class IncorrectProducerConsumer {
    
    public static void main(String[] args) {
        
        Queue queue = new Queue();
        
        Producer producer = new Producer(queue);
        Consumer consumer =new Consumer(queue);
        
        producer.start();
        consumer.start();
    }
}
