package com.example.song_validate.service;

import com.example.song_validate.model.Song;
import com.example.song_validate.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void create(Song song);
    void update(Song song);

}
