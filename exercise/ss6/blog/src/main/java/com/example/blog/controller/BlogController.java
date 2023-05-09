package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("/")
    public String text(Model model){
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogs",blogList); //gán đối tượng dùng addAttribute
        return "/list";
    }
}
