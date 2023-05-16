package com.example.movie_trailer.repository;

import com.example.movie_trailer.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Movie, Integer> {
}
