package com.rationalagent.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class ApplicationController {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    @RequestMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("email", new Email());
        return "index";
    }

    @PostMapping("/email")
    public String submit(@ModelAttribute Email email, BindingResult bindingResult, Model model) {
        logger.info("email: " + email.toString());
        return "redirect:";
    }

}
