/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turing.javase6.designpattern.bridge;

/**
 *
 * @author Mr T.Khine
 */
public class CanvasAPI implements DrawingAPI{

    @Override
    public void drawCircle() {
        System.out.println("Draw Canvas Circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Draw Canvas Rectangle");
    }
    
}
