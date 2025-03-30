/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.decorator;

/**
 *
 * @author macbook
 */
public class WithPaeThee implements MoteHinGar{
    
    MoteHinGar moteHinGar;
    WithPaeThee(MoteHinGar moteHinGar)
    {
        this.moteHinGar = moteHinGar;
    }

    @Override
    public String prepare() {
        return this.moteHinGar.prepare() + " with PaeThee";
    }
}
