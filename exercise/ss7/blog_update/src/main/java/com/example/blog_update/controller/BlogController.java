package com.example.blog_update.controller;
import com.example.blog_update.model.Blog;
import com.example.blog_update.service.IBlogService;
import com.example.blog_update.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private  IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showListBlog(@PageableDefault(value = 2, sort = "id", direction = Sort.Direction.DESC)
                               Pageable pageable, @RequestParam(value = "search",defaultValue = "")
                               String search, Model model){
        model.addAttribute("blogList", iBlogService.findByTitle(search, pageable));
        model.addAttribute("categoryList", iCategoryService.findAll());
        model.addAttribute("search", search);
        return "blog/list";
    }
    @GetMapping("/dto")
    public String showListDto(Model model){
        model.addAttribute("dtoList",iBlogService.showListDto());
        return "blog/dto";
    }
    @GetMapping("/add")
    public String save(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "blog/create";
    }

}

