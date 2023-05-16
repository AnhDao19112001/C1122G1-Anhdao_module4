package com.example.movie_trailer.service;

import com.example.movie_trailer.model.Premiere;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IPremiereService {
    List<Premiere> findAll();
    void create(Premiere premiere);
    void delete(int id);
    void edit(Premiere premiere);
    Premiere findById(int id);
}
