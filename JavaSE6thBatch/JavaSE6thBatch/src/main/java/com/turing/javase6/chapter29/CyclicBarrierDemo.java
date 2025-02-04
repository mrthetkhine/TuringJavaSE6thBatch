/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author macbook
 */
class ImageDownloader extends Thread
{
    CyclicBarrier barrier;
    String name;
    
    ImageDownloader(CyclicBarrier barrier,String name)
    {
        this.barrier = barrier;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Download image "+this.name);
        try
        {
            Thread.sleep(1000);
            System.out.println("Download image "+this.name+ " Done");
            this.barrier.await();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
class ImageProcessor implements Runnable
{

    @Override
    public void run() {
        System.out.println("Process image");
    }
    
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,new ImageProcessor());
        
        ImageDownloader img1 =new ImageDownloader(barrier, "One");
        ImageDownloader img2 =new ImageDownloader(barrier, "Two");
        ImageDownloader img3 =new ImageDownloader(barrier, "Three");
        ImageDownloader img4 =new ImageDownloader(barrier, "Four");
        ImageDownloader img5 =new ImageDownloader(barrier, "Five");
        ImageDownloader img6 =new ImageDownloader(barrier, "Six");
        
        img1.start();
        img2.start();
        img3.start();
        img4.start();
        img5.start();
        img6.start();
        
    }
}
