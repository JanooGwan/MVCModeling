package com.example.TestMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {
    @GetMapping("/members")
    public String members() { return "members"; }

}
