/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter6;

/**
 *
 * @author macbook
 */
class Data
{
    int value;

    /*
    @Override
    public String toString() {
        return "Data{" + "value=" + value + '}';
    }
    */
    
}
public class CopyRefSemantic {
    public static void main(String[] args) {
        Data obj1 = new Data();
        obj1.value = 100;
        
        Data obj2 = new Data();
        obj2.value = 200;
        
        System.out.println("Obj1 "+obj1.value);
        System.out.println("Obj2 "+obj2.value);
        
        int a = 10;
        int b ;
        b = a;//copy
        a++;
        
        System.out.println("A "+a+ " B "+b);
        
        obj1 = obj2;//reference semantics?
        //obj1.value = 500;
        obj1.value ++;
        
        if(obj1 == obj2)
        {
            System.out.println("Same object");
        }
        
        System.out.println("Obj 1 "+obj1.value);
        System.out.println("Obj2 "+obj2.value);
        
        obj2 = new Data();
        obj2.value = 40;
        
        if(obj1 == obj2)
        {
            System.out.println("Same object");
        }
        else
        {
            System.out.println("Different");
        }
        System.out.println("Obj 1 "+obj1.value);
        System.out.println("Obj2 "+obj2.value);
                
    }
}
