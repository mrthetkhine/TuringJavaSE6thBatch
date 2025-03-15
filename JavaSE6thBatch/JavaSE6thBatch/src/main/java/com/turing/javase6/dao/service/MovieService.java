/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase6.dao.service;

import com.turing.javase6.dao.entity.Movie;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface MovieService {
    List<Movie> getAllMovie();
    boolean saveMovie(Movie movie);
    boolean updateMovie(Movie movie);
    boolean deleteMovieById(Long id);
}
