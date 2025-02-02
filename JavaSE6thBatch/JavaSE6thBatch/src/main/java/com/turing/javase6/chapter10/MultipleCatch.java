/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter10;

/**
 *
 * @author macbook
 */
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10,20,30};
            System.out.println("Arr [2] "+arr[2]);
            
            String str = null;
            System.out.println("toUppercase "+str.toUpperCase());
        } /*catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Ae "+e.getMessage());
        }catch(NullPointerException ne)
        {
            System.out.println("NullPointer exception");
        }*/
        catch(ArrayIndexOutOfBoundsException | NullPointerException e )
        {
            System.out.println("Something bad happeen ");
            e.printStackTrace();
            
            //e = new RuntimeException("Sometype");
        }
    }
}
