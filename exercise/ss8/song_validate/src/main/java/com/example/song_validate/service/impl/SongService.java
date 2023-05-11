package com.example.song_validate.service.impl;

import com.example.song_validate.model.Song;
import com.example.song_validate.repository.ISongRepository;
import com.example.song_validate.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void create(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public void update(Song song) {
        iSongRepository.save(song);
    }
}
