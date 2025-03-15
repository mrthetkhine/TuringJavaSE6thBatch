/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.ActorInMovieDao;
import com.turing.javase6.dao.impl.ActorInMovieDaoImpl;

/**
 *
 * @author macbook
 */
public class MovieActorAssignmentServiceImpl implements MovieActorAssignmentService{
    ActorInMovieDao actorInMovieDao = new ActorInMovieDaoImpl();
    
    @Override
    public boolean addActorToMovie(Long movieId, Long actorId) {
        return this.actorInMovieDao.addActorToMovie(movieId, actorId);
    }
    
}
