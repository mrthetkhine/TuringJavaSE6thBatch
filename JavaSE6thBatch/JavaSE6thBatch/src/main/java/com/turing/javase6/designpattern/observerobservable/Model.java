/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.observerobservable;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Model implements Publisher{
    ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber sub)
    {
        this.subscribers.add(sub);
    }
    public void removeSubscriber(Subscriber sub)
    {
        this.subscribers.remove(sub);
    }
    @Override
    public void notifySubscriber(String data) {
        System.out.println("Model change "+data);
        for(Subscriber sub: this.subscribers)
        {
            sub.update(data);
        }
    }
    
}
