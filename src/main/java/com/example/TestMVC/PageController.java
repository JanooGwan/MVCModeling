package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/members")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userRepository.getAllUsers());
        return "members";
    }
}
