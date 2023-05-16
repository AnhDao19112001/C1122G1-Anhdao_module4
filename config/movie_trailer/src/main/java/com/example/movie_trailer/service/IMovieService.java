package com.example.movie_trailer.service;

import com.example.movie_trailer.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> findAll();
}
