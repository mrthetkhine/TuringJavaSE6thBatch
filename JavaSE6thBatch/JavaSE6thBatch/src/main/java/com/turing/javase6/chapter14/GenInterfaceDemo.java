/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter14;

/**
 *
 * @author macbook
 */
class Human implements Comparable<Human>
{
    String name;
    int age;

    Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Human another) {
        return this.age - another.age;
    }
    
    
}
interface MinMax<T extends Comparable>
{
    T min();
    T max();
}
class List<T extends Comparable<T>> implements MinMax<T>
{

    T[] items;
    List(T[] items)
    {
        this.items = items;
    }
    @Override
    public T min() {
        T minEle= this.items[0];
        for (int i = 1; i < this.items.length; i++) {
            if( minEle.compareTo(this.items[i])>0)//minEle > item[i]
            {
                minEle = this.items[i];
            }
        }
        return minEle;
    }

    @Override
    public T max() {
        T maxEle= this.items[0];
        for (int i = 1; i < this.items.length; i++) {
            if( maxEle.compareTo(this.items[i])<0)//maxEle < item[i]
            {
                maxEle = this.items[i];
            }
        }
        return maxEle;
    }
    
}
public class GenInterfaceDemo {
    public static void main(String[] args) {
        Human[] humans = {
            new Human("H1",15),
            new Human("H2",30),
            new Human("H3",12)
        };
        List<Human> list = new List<>(humans);
        Human oldest = list.max();
        Human youngest = list.min() ;
        
        System.out.println("Oldest "+ oldest.age);
        System.out.println("youngest "+ youngest.age);
        
        String[] strArrays = {
            "One",
            "Two",
            "Apple",
        };
        List<String> list2 = new List<>(strArrays);
        String smallest = list2.min();
        String largest = list2.max();
        
        System.out.println("Smallest "+smallest);
        System.out.println("largest "+largest);
    }
}
