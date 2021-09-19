package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class menu_test {
    @GetMapping("/menu_test")
    public String menu(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "menu";
    }
}