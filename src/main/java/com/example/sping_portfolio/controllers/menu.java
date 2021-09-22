package com.example.sping_portfolio.controllers;


///* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
// * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
// */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class menu {
    @GetMapping("/menu")
    public String Menu(@RequestParam(name="total_cost", required=false, defaultValue="0") double total_cost, Model model) {
        model.addAttribute("total_cost", total_cost);
        return "menu";
    }
}
