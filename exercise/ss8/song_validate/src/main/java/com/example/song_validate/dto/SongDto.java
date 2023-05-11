package com.example.song_validate.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto implements Validator {
    private int id;
    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 1, max = 8000, message = "Tên có độ dài tối thiểu 1, tối đa 8000 ký tự.")
    @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String nameSong;
    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 1, max = 300, message = "Tên có độ dài tối thiểu 1, tối đa 300 ký tự.")
    @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String artist;

    public SongDto() {
    }

    public SongDto(int id, String nameSong, String artist) {
        this.id = id;
        this.nameSong = nameSong;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
