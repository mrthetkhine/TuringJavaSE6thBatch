/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.adaptor;

/**
 *
 * @author macbook
 */
public class ObjectAdapter implements Api{
    LegacyApi legacy = new LegacyApi();

    @Override
    public void api() {
        this.legacy.oldApi();
    }
}
