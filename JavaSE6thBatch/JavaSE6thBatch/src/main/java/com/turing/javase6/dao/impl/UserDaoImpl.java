/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.impl;

import com.turing.javase6.dao.BaseDao;
import com.turing.javase6.dao.UserDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author macbook
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    public static final String SALT = "$%@!124";
    
    @Override
    public boolean saveUser(String username, String password) {
    
        String sql = "INSERT INTO User(username,password) VALUES(?,SHA2(CONCAT(?,?),256));";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, username);
            stmt.setString(2, SALT);
            stmt.setString(3, password);
            
            
            int row = stmt.executeUpdate();
            
            return row>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean login(String username, String password) {
    
        String sql = "SELECT * FROM  User WHERE username= ?" +
                " AND password=SHA2(CONCAT(?,? ),256);";
        System.out.println("SQL "+sql);
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, username);
            stmt.setString(2, SALT);
            stmt.setString(3, password);
          
            ResultSet res = stmt.executeQuery();
            
            return res.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean isUserExist(String username) {
    
        String sql = "SELECT * FROM  User WHERE username= ?";
        System.out.println("SQL "+sql);
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, username);
           
          
            ResultSet res = stmt.executeQuery();
            
            return res.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        //userDao.saveUser("admin", "admin");
        //boolean loginResult = userDao.login("admin' OR 1; ##;", "1222");
        boolean loginResult = userDao.login("admin","admin");
        System.out.println("Login ok "+loginResult);
    }
}
