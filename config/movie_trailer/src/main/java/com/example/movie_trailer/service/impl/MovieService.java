package com.example.movie_trailer.service.impl;

import com.example.movie_trailer.model.Movie;
import com.example.movie_trailer.repository.IMovieRepository;
import com.example.movie_trailer.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private IMovieRepository iMovieRepository;
    @Override
    public List<Movie> findAll() {
        return iMovieRepository.findAll();
    }
}
