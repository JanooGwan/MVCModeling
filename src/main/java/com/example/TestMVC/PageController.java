package com.example.TestMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    @GetMapping("/members")
    public String members(Model model) {
        model.addAttribute("users", UserService.);
        return "members";
    }
}
