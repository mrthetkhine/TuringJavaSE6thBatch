/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.strategy;

/**
 *
 * @author macbook
 */
public class SearchAlgo {
    
    SearchingStrategy strategry;
    
    public void setStrategy(SearchingStrategy strategry)
    {
        this.strategry = strategry;
    }
    void search()
    {
        this.strategry.search();
    }
}
