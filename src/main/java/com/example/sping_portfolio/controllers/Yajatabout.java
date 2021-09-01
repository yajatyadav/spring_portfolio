package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Yajatabout {
    @GetMapping("/yajatabout")    // CONTROLLER handles GET request for /yajatabout, maps it to yajatbout() and does variable bindings
    public String yajat_about(@RequestParam(name="name", required=false, defaultValue="x") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "yajatabout"; // returns HTML VIEW
    }
}

