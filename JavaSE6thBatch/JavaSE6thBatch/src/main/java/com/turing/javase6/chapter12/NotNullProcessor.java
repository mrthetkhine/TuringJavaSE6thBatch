/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class NotNullProcessor {
    public static void checkNull(Object obj)
    {
        Field[]fields = obj.getClass().getDeclaredFields();
        
        for(Field field : fields)
        {
            //System.out.println("Filedname "+field.getName());
            NotNull anno = field.getAnnotation(NotNull.class);
            if(anno !=null)
            {
                try {
                    //System.out.println("Field "+field.getName()+" have annotation");
                    Object value = field.get(obj);
                    if(value ==null)
                    {
                        String message = anno.message();
                        if(!message.isEmpty())
                        {
                            System.out.println(message);
                        }
                        else
                        {
                            System.err.println("Field "+field.getName()+ " is null");
                        }
                        //System.err.println();
                        //System.err.println("Field "+field.getName()+ " is null");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            
        }
        
    }
    public static void main(String[] args) {
        Human h = new Human();
        //h.name = "Test";
        Data data = new Data();
        
        checkNull(h);
        
    }
}
