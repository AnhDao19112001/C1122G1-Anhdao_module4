package com.example.song_validate.repository;

import com.example.song_validate.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music, Integer> {
    Music findById(int id);
}
