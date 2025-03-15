/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.MovieDao;
import com.turing.javase6.dao.entity.Movie;
import com.turing.javase6.dao.impl.MovieDaoImpl;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MovieServiceImpl implements MovieService{

    MovieDao movieDao =new MovieDaoImpl();
    @Override
    public List<Movie> getAllMovie() {
        return movieDao.getAllMovie();
    }

    @Override
    public boolean saveMovie(Movie movie) {
        return movieDao.saveMovie(movie);
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return movieDao.updateMovie(movie);
    }

    @Override
    public boolean deleteMovieById(Long id) {
        return movieDao.deleteMovieById(id);
    }
    
}
