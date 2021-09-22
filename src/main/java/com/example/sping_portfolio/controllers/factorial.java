package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class factorial {
    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "name", required = false, defaultValue = "x") String name, Model model){
        model.addAttribute("name", name);
        return "factorial";
    }
}