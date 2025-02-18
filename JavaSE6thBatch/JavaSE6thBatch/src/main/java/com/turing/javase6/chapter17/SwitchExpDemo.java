/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter17;



/**
 *
 * @author macbook
 */
interface Employee
{
}
class RegularEmployee implements Employee
{
    
}
enum CSuiteEmployee implements Employee
{
    CEO,CFO,
}
public class SwitchExpDemo {
    public static void main(String[] args) {
        Employee emp = CSuiteEmployee.CFO;
        
        if(emp instanceof CSuiteEmployee cse)
        {
            switch(cse)
            {
                case CEO->System.out.println("It is boss");
                case CFO->System.out.println("There is money");
            }
        }
    
    }
}
