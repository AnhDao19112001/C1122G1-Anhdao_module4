package com.example.movie_trailer.service.impl;

import com.example.movie_trailer.model.Premiere;
import com.example.movie_trailer.repository.IPremiereRepository;
import com.example.movie_trailer.service.IPremiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremiereService implements IPremiereService {
    @Autowired
    private IPremiereRepository iPremiereRepository;
    @Override
    public List<Premiere> findAll() {
        return iPremiereRepository.findAll();
    }

    @Override
    public void create(Premiere premiere) {
        iPremiereRepository.save(premiere);
    }

    @Override
    public void delete(int id) {
        iPremiereRepository.deleteById(id);
    }

    @Override
    public void edit(Premiere premiere) {
        iPremiereRepository.save(premiere);
    }

    @Override
    public Premiere findById(int id) {
        return iPremiereRepository.findById(id);
    }
}
