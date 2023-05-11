package com.example.validate_form_regiter.controller;

import com.example.validate_form_regiter.dto.UserDto;
import com.example.validate_form_regiter.model.User;
import com.example.validate_form_regiter.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("userList", iUserService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute @Validated UserDto userDto, BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
             iUserService.create(user);
            redirectAttributes.addFlashAttribute("msg", "Add new User successful!!");
        }
        return "redirect:/user";
    }
}
