/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.turing.javase6.dao.entity;

import java.util.Date;

/**
 *
 * @author macbook
 */
public record Actor(Long id,String name,String gender,Date birthday) {

}
