/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ViewGroup extends UIWidget{

    List<UIWidget> children= new ArrayList<>();
    
    public ViewGroup(String name)
    {
        super(name);
    }
    public void addChild(UIWidget widget)
    {
        this.children.add(widget);
    }
    @Override
    void paint() {
        System.out.println("Paint "+this.name);
        for(UIWidget widget : this.children)
        {
            widget.paint();
        }
    }
    
}
