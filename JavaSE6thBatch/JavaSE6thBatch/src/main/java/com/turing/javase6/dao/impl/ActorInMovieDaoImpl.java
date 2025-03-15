/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.impl;

import com.turing.javase6.dao.ActorInMovieDao;
import com.turing.javase6.dao.BaseDao;
import java.sql.PreparedStatement;

/**
 *
 * @author macbook
 */
public class ActorInMovieDaoImpl extends BaseDao implements ActorInMovieDao{

    @Override
    public boolean addActorToMovie(Long movieId, Long actorId) {
        String sql = "INSERT INTO movie_actor(movie_id,actor_id) VALUES(?,?);";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setLong(1, movieId);
            stmt.setLong(2, actorId);
            
            int row = stmt.executeUpdate();
            
            return row>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
}
