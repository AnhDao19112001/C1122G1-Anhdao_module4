package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogs", blogList); //gán đối tượng dùng addAttribute
        return "/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog", new Blog());
        return "/create";
    }
    @PostMapping("/create")
    public String create(Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("smg","Add new product successful!");
        return "redirect:/";
    }
    @GetMapping("/deltai/{id}")
    public String deltai(@PathVariable int id, Model model){
        model.addAttribute("blog", iBlogService.findById(id));
        return "/deltai";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam Integer idDelete, RedirectAttributes redirectAttributes){
        iBlogService.delete(idDelete);
        redirectAttributes.addFlashAttribute("smg","Remove product successful!");
        return "redirect:/";
    }
    @GetMapping("/search")
    public String searchName(@RequestParam String title, Model model){
        model.addAttribute("blogs", iBlogService.findByName(title));
        return "/list";
    }
    @GetMapping("/search")
    public String searchId(@RequestParam int id, Model model){
        model.addAttribute("blogs", iBlogService.findById(id));
        return "/list";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model){
        model.addAttribute("blog", iBlogService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.update(blog);
        redirectAttributes.addFlashAttribute("smg", "Update product successful!");
        return "redirect:/";
    }
}
