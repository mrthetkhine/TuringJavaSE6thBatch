/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase6.dao;

import java.util.List;
import com.turing.javase6.dao.entity.*;

/**
 *
 * @author macbook
 */
public interface MovieDao {
    List<Movie> getAllMovie();
    Movie getMovieById(String id);
    boolean saveMovie(Movie movie);
    boolean updateMovie(Movie movie);
    boolean deleteMovieById(Long id);
}
