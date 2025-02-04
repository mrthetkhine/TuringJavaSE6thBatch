/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
class ExecutorTask extends Thread
{
    String name;
    ExecutorTask(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            try
            {
                System.out.println("Thread "+this.name+ " i=> "+i);
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(2);
        
        for (int i = 0; i < 5; i++) {
             exs.execute(new ExecutorTask("Thread "+i));
        }
       
      
        
        exs.shutdown();
    }
}
