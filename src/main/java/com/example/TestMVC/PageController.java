package com.example.TestMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/members")
    public String members(Model model) {
        model.addAttribute("users", UserRepository.users);
        return "members";
    }
}
