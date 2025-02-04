/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author macbook
 */
class Factorial implements Callable<Double>{

    int n;
    Factorial(int n)
    {
        this.n = n;
    }
    @Override
    public Double call() throws Exception {
        double total =1;
        for (int i = 1; i <= n; i++) {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            total *= i;
        }
        System.out.println("Fact done");
        return total;
    }
}
class Sum implements Callable<Integer>{

    int end;
    Sum(int end)
    {
        this.end = end;
    }
    @Override
    public Integer call() throws Exception {
        int total =0;
        for (int i = 1; i <= end; i++) {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            total += i;
        }
        System.out.println("Sum done");
        return total;
    }
}
public class CallableFutureDemo {
    public static void main(String[] args) {
         ExecutorService exs = Executors.newFixedThreadPool(2);
         Future<Integer> total =exs.submit(new Sum(5));
         Future<Double> fact =exs.submit(new Factorial(5));
         
         System.out.println("Main after submit");
         
        
        try
        {
           int result = total.get(3,TimeUnit.SECONDS);
           System.out.println("Total "+result);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
           double factResult =fact.get();
           System.out.println("Fact "+factResult);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
           
        
         exs.shutdown();
    }
}
