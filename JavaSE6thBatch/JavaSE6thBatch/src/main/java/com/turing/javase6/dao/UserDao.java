/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao;

/**
 *
 * @author macbook
 */
public interface UserDao {
    public boolean saveUser(String username,String password);
    boolean login(String username, String password);
    boolean isUserExist(String username);
}
