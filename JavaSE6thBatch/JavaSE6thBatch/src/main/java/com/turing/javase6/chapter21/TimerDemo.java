/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter21;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author macbook
 */
class MyTask extends TimerTask
{

    @Override
    public void run() {
        System.out.println("Task run "+new Date());
    }
    
}
public class TimerDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer myTimer =new Timer();
        
        myTimer.schedule(task, 1000);
        
        try
        {
            Thread.sleep(6000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        task.cancel();
    }
}
