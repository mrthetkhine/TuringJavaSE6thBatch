/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.UserDao;
import com.turing.javase6.dao.impl.UserDaoImpl;

/**
 *
 * @author macbook
 */
public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoImpl();
    
    @Override
    public void registerUser(String username, String password)throws Exception {
        boolean isExisting = userDao.isUserExist(username);
        if(isExisting)
        {
            throw new Exception("User already existed");
        }
        else
        {
            this.userDao.saveUser(username, password);
        }
    }

    @Override
    public boolean loginUser(String username, String password)throws Exception {
        boolean loginOk = this.userDao.login(username, password);
        if(!loginOk)
        {
            throw new Exception("Invalid user");
        }
        return loginOk;
    }
    
}
