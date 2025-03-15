/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author macbook
 */
public class BaseDao {
    Connection conn;
    private static BaseDao singleton;
    
    static
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public BaseDao() {
        try
        {
            this.conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javase6_sql", 
                                                        "root", "Root@3421C");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public Connection getConnection()
    {
        return this.conn;
    }
    public static void main(String[] args) {
        new BaseDao();
    }
}
