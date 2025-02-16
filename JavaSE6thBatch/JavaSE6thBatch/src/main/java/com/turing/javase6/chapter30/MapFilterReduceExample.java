/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,Female;
}
class Human
{
    String name;
    int age;
    Gender gender;
    public Human(String name,int age,Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
}
public class MapFilterReduceExample {
    public static void main(String[] args) {
        Human list[] = {
            new Human("Aung Aung",30,Gender.Male),
            new Human("Mya Mya",20,Gender.Female),
            new Human("Hla Hla",50,Gender.Female),
            new Human("Aung Min",12,Gender.Male),
            new Human("Tin Aung",43,Gender.Male),
            
        };
        Stream<Human> stream = Arrays.stream(list);
        
        stream.filter(h->h.gender==Gender.Male)
              .reduce((a,b)-> a.getAge()< b.getAge()?a:b)
              .map(h->h.getName())
              .stream()
              .forEach(System.out::println);
        //stream.forEach(System.out::println);
    }
}
