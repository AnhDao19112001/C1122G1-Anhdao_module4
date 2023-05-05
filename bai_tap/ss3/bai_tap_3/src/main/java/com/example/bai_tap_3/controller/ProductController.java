package com.example.bai_tap_3.controller;

import com.example.bai_tap_3.model.Product;
import com.example.bai_tap_3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String showList(Model model){
        List<Product> productList = iProductService.findAll();
        model.addAttribute("products", productList);
        return "/list";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/view";
    }
    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("mess", "Add new product successful!");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.edit(product);
        redirectAttributes.addFlashAttribute("mess", "Update product successful!");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    private String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        iProductService.delete(product.getId());
        redirectAttributes.addFlashAttribute("mess", "Remove product successful!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String showListSearch(@RequestParam String name, Model model) {
        model.addAttribute("products", iProductService.findByName(name));
        return "/list";
    }
}
