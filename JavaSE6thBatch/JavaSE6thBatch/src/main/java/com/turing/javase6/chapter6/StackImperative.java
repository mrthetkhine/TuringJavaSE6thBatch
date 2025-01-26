/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter6;
import com.turing.javase6.chapter8.Data;
/**
 *
 * @author macbook
 */
public class StackImperative {
    
    static int push(int[]stack,int top, int item)
    {
        stack[++top] = item; 
        return top;
    }
    public static void main(String[] args) {
        int top = -1;
        int stack[] = new int[10];
        
        top = push(stack,top,10);
        
        System.out.println("Stack "+stack[0]);
        System.out.println("Top "+top);
        
        top = push(stack,top,20);
        System.out.println("Stack "+stack[1]);
        System.out.println("Top "+top);
        
        int top2= -1;
        int stack2[] = new int[10];
        
        top2 = push(stack2,top,20);
        
        Data data =new Data();
        //data.value ++;
    }
}
