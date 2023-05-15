package com.example.luyen_tap.controller;

import com.example.luyen_tap.service.IClothingStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClothingStoreController {
    @Autowired
    private IClothingStoreService iClothingStoreService;
    @GetMapping("/")
    public String showListClothing(Model model){
        model.addAttribute("msg","anh Đạt bịp");
        return "/list";
    }
}
