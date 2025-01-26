/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter8;

/**
 *
 * @author macbook
 */
class Window95
{
    public void startComputer()
    {
        System.out.println("Start computer");
    }
}
class Window98 extends Window95
{
    public void feature()
    {
        System.out.println("New Feature");
    }
}
public class Window {
    public static void main(String[] args) {
        Window98 win= new Window98();
        
        win.startComputer();
        win.feature();
        Data data = new Data();
        data.value = 10;
        
        Parent parent = new Parent();
        parent.data = 100;
    }
}
