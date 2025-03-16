/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.unitest;

import com.turing.javase.unitest.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestTotal {
    
    @Test
    public void testTotal()
    {
        Total obj = new Total();
        int result = obj.sum(1,2,3);
        
        assertEquals(6,result);
    }
}
