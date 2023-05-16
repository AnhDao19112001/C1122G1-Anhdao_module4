package com.example.movie_trailer.controller;


import com.example.movie_trailer.dto.PremiereDto;
import com.example.movie_trailer.model.Premiere;
import com.example.movie_trailer.service.IMovieService;
import com.example.movie_trailer.service.IPremiereService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class PremiereController {
    @Autowired
    private IPremiereService iPremiereService;
    @Autowired
    private IMovieService iMovieService;
    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("movieList",iMovieService.findAll());
        model.addAttribute("premiereList", iPremiereService.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String showListCreate(Model model){
        model.addAttribute("premiereDto",new PremiereDto());
        return "create";
    }
    @PostMapping("/save")
    public String listSave(@ModelAttribute @Validated PremiereDto premiereDto, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes){
        new PremiereDto().validate(premiereDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            Premiere premiere = new Premiere();
            BeanUtils.copyProperties(premiereDto, premiere);
            iPremiereService.create(premiere);
            redirectAttributes.addFlashAttribute("msg","add successful!");
        }
        return "redirect:/";
    }
}
