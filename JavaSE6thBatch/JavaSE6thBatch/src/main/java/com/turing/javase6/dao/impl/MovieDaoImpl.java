/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.impl;

import com.turing.javase6.dao.BaseDao;
import com.turing.javase6.dao.MovieDao;
import com.turing.javase6.dao.entity.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MovieDaoImpl extends BaseDao implements MovieDao{

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> movies = new ArrayList<>();
        try(Statement stmt = this.getConnection().createStatement())
        {
            String sql = "SELECT * FROM Movie;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                Long id= rs.getLong("ID");
                String title = rs.getString("title");
                String genre = rs.getString("genre");
                Integer year = rs.getInt("year");
                
                Movie movie =new Movie(id,title,genre,year);
                movies.add(movie);
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movies;
        
    }
    

    
    @Override
    public boolean saveMovie(Movie movie) {
        String sql = "INSERT INTO Movie(title,genre,year) VALUES(?,?,?);";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, movie.title());
            stmt.setString(2, movie.genre());
            stmt.setLong(3, movie.year());
            
            
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
    public Movie getMovieById(String id) {
        Movie movie =null;
        String sql = "SELECT * FROM Movie WHERE id=?";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, id);
            
            System.out.println("SQL "+sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Long id2 = rs.getLong("ID");
                String title = rs.getString("title");
                String genre = rs.getString("genre");
                Integer year = rs.getInt("year");
                
                movie =new Movie(id2,title,genre,year);
               
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movie;
    }
    @Override
    public boolean updateMovie(Movie movie) {
        String sql = "UPDATE  Movie SET title=?, genre=? , year=? WHERE ID=?";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setString(1, movie.title());
            stmt.setString(2, movie.genre());
            stmt.setLong(3, movie.year());
            stmt.setLong(4, movie.id());
            
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
    public boolean deleteMovieById(Long id) {
        String sql = "DELETE FROM Movie WHERE ID=?";
        try(PreparedStatement stmt = this.getConnection().prepareStatement(sql))
        {
            stmt.setLong(1, id);
            
            int row = stmt.executeUpdate();
            
            return row>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        //Movie movieToInsert = new Movie(14L,"Termininator-Update","Sci-Fi",2015);
        //movieDao.updateMovie(movieToInsert);
        movieDao.deleteMovieById(14L);
       
        List<Movie> movies = movieDao.getAllMovie();
        movies.forEach(System.out::println);
        
        //Movie movie = movieDao.getMovieById("1 OR 1");
        //System.out.println("Movie "+movie);
    }

    

    

    
}
