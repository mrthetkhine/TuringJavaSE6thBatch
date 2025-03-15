/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.impl;

import com.turing.javase6.dao.ActorDao;
import com.turing.javase6.dao.BaseDao;
import com.turing.javase6.dao.entity.Actor;
import com.turing.javase6.dao.entity.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ActorDaoImpl extends BaseDao implements ActorDao{
    @Override
    public List<Actor> getAllActor() {
        String sql ="SELECT * FROM actor;" ;
        List<Actor> actors = new ArrayList<Actor>();
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
           
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Long actorId = rs.getLong("ID");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("birthday");
                
                Actor actor = new Actor(actorId,name,gender,birthday);
                actors.add(actor);
               
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return actors;
    }
    @Override
    public List<Actor> getAllActorInMovie(Long movieId) {
        String sql ="SELECT actor.* FROM movie_actor,actor " +
                    "WHERE movie_id= ? " +
                    "AND movie_actor.actor_id=actor.id;";
        List<Actor> actors = new ArrayList<Actor>();
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setLong(1, movieId);
            
            System.out.println("SQL "+sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Long actorId = rs.getLong("ID");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("birthday");
                
                Actor actor = new Actor(actorId,name,gender,birthday);
                actors.add(actor);
               
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return actors;
    }
    public static void main(String[] args) {
        ActorDao actorDao = new ActorDaoImpl();
        List<Actor> actors = actorDao.getAllActorInMovie(1L);
        actors.forEach(System.out::println);
    }

    
}
