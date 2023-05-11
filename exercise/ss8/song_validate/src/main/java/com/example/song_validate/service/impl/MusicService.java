package com.example.song_validate.service.impl;

import com.example.song_validate.model.Music;
import com.example.song_validate.repository.IMusicRepository;
import com.example.song_validate.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;
    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        iMusicRepository.save(music);
    }
}
