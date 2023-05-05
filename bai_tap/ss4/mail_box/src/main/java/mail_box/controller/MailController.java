package mail_box.controller;

import mail_box.model.Mail;
import mail_box.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MailController {
    @Autowired
    private IMailService iMailService;

    @GetMapping("/")
    public String showMail(Model model) {
        List<Mail> mailList = iMailService.findAll();
        model.addAttribute("mailList", mailList);
        return "list";
    }
    @GetMapping ("/update")
    public String home(@RequestParam int id, Model model) {
        model.addAttribute("email", iMailService.findById(id));
        model.addAttribute("languageList", iMailService.findLanguage());
        model.addAttribute("pageSizeList", iMailService.findPageSize());
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Mail email, RedirectAttributes redirectAttributes) {
        iMailService.update(email);
        redirectAttributes.addFlashAttribute("mess", "Update successful!");
        return "redirect:/";
    }
}
