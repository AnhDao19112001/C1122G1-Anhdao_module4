package com.example.song_validate.service;

import com.example.song_validate.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(int id);

    void update(Music music);
}
