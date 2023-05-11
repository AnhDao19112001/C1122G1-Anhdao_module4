package com.example.song_validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/song")
public class SongController {
    @GetMapping("")
    public String showListSong(Model model){
        model.addAttribute("msg","hello");
        return "list_song";
    }
}
