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
class PrinterThread extends Thread
{
    Semaphore sem;
    String name;
    PrinterThread(String name,Semaphore sem)
    {
        this.name = name;
        this.sem = sem;
    }
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            try
            {
                
                this.sem.acquire();
                Thread.sleep(2000);
                System.out.println("Thread "+this.name+ " => "+i);
                this.sem.release();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sm = new Semaphore(2);
        
        PrinterThread t1 = new PrinterThread("One",sm);
        PrinterThread t2 = new PrinterThread("Two",sm);
        PrinterThread t3 = new PrinterThread("Three",sm);
        PrinterThread t4 = new PrinterThread("Four",sm);
        
        PrinterThread t5 = new PrinterThread("Five",sm);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
