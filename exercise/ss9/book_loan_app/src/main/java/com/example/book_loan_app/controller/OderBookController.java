package com.example.book_loan_app.controller;

import com.example.book_loan_app.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OderBookController {
    @Autowired
    private IOderService oderService;

    @GetMapping("/oder")
    public String showListBorrow(Model model) {
        model.addAttribute("oders", this.oderService.findAll());
        return "list-borrow";
    }
}
