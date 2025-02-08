/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author macbook
 */
class Sum extends RecursiveTask<Double>
{ 
    int TRESHOLD = 1_000;
    double data[];
    int start,end;
    
    Sum(double[]data,int start , int end)
    {
        System.out.println("New Sum start "+start + " end "+end);
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if(( end-start)< TRESHOLD)
        {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else//divide
        {
            int middle = (start + end )/2;
            Sum task1 = new Sum(data,start,middle);
            Sum task2 = new Sum(data,middle+1,end);
            
            task1.fork();
            task2.fork();
            
            sum = task1.join() + task2.join();
        }
        return sum;
    }
}
public class RecursiveTaskDemo {
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
        
        Sum task = new Sum(data,0,data.length);
        double result = pool.invoke(task);
        System.out.println("Result "+result);
    }
}
