/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter29;

import java.util.concurrent.Exchanger;

/**
 *
 * @author macbook
 */
class MakeString extends Thread
{
    Exchanger<String> ex;
    String str;
    
    MakeString(Exchanger<String> ex)
    {
        this.ex = ex;
        this.str = "";
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 5; j++) {
                str += ch ++;
            }
            try
            {
                System.out.println("Send "+str);
                str = this.ex.exchange(str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class UseString extends Thread
{
    Exchanger<String> ex;
    String str;
    
    UseString(Exchanger<String> ex)
    {
        this.ex = ex;
        this.str = "";
    }
    public void run()
    {
        for (int i = 0; i < 3; i++) {
            try
            {
                this.str = this.ex.exchange(new String());
                System.out.println("Got "+this.str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        var exchanger =new Exchanger<String>();
        MakeString maker =new MakeString(exchanger);
        UseString stringUser =new UseString(exchanger);
        
        stringUser.start();
        maker.start();
        
    }
}
