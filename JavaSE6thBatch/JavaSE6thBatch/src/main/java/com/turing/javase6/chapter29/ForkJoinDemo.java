/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author macbook
 */
class SqrtTransform extends RecursiveAction
{
    //int TRESHOLD = 10_001;
    int TRESHOLD = 1_000;
    double data[];
    int start,end;
    
    SqrtTransform(double[]data,int start , int end)
    {
        System.out.println("New SqrtTransform start "+start + " end "+end);
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if(( end-start)< TRESHOLD)
        {
            for (int i = start; i < end; i++) {
                this.data [i] = Math.sqrt(data[i]);
                try
                {
                    Thread.sleep(1);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        else//divide
        {
            int middle = (start + end) /2;
            invokeAll(new SqrtTransform(data,start,middle),
                    new SqrtTransform(data,middle+1,end));
        }
    }
    
}
public class ForkJoinDemo {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        double data[] = new double[10_000];
        for (int i = 0; i < data.length; i++) {
            data[i]= i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        
        SqrtTransform task = new SqrtTransform(data,0,data.length);
        pool.invoke(task);
        
         for (int i = 0; i < 10; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        double end = System.currentTimeMillis();
        System.out.println("Time "+ (end-start));
    }
}
