package com.example.movie_trailer.repository;

import com.example.movie_trailer.model.Premiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPremiereRepository extends JpaRepository<Premiere, Integer> {
    Premiere findById(int id);
}
