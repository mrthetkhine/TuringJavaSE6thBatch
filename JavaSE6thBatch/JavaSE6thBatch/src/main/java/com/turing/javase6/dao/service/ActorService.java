/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.entity.Actor;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface ActorService {
    List<Actor> getAllActor();
    List<Actor> getAllActorInMovie(Long movieId);
}
