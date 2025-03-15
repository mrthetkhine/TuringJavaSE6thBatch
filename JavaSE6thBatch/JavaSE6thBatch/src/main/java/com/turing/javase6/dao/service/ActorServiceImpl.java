/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.ActorDao;
import com.turing.javase6.dao.entity.Actor;
import com.turing.javase6.dao.impl.ActorDaoImpl;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ActorServiceImpl implements ActorService{

    ActorDao actorDao = new ActorDaoImpl();
    @Override
    public List<Actor> getAllActor() {
        return this.actorDao.getAllActor();
    }

    @Override
    public List<Actor> getAllActorInMovie(Long movieId) {
        return this.actorDao.getAllActorInMovie(movieId);
    }
    
}
