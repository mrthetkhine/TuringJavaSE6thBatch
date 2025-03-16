/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.unitest;
import com.turing.javase6.chapter6.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author macbook
 */

public class TestStack {
    @Test
    public void testPush()
    {
        //Arrange
        Stack stack = new Stack();
        
        //Act
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        //Assert
        assertEquals(3,stack.size());
    }
    @Test
    public void testPop()
    {
        Stack stack = new Stack();
        
        //Act
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        assertEquals(30,stack.pop());
        assertEquals(20,stack.pop());
        assertEquals(10,stack.pop());
        assertEquals(0,stack.size());
    }
}
