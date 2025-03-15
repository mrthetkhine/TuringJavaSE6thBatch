/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase6.dao.service;

/**
 *
 * @author macbook
 */
public interface UserService {
    void registerUser(String username,String password)throws Exception;
    boolean loginUser(String username,String password)throws Exception;
}
