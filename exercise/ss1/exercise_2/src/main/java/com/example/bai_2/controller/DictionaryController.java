package com.example.bai_2.controller;

import com.example.bai_2.model.Dictionary;
import com.example.bai_2.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {
    private DictionaryService dictionaryService = new DictionaryService();
    @GetMapping("/search")
    public String search() {
        return "index";
    }
    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model){
        List<Dictionary> dictionaries = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEnglish())) {
                model.addAttribute("word", dictionaries.get(i).getVietNam());
                model.addAttribute("key", keyword);
                return "mean";
            }
        }
        return "mean";
    }
}
