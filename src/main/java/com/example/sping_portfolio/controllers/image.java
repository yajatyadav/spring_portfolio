package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */


import org.springframework.stereotype.Component;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.LongStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class image {
    @GetMapping("/images")
    public String Images(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
    HttpServletResponse response) throws IOException{
        model.addAttribute("name", name);

        //set up output
        PrintWriter out = response.getWriter();
        String html = "";

        //need to work on boolean, check for button press, experiment with this:
        // boolean start = req.getAttribute("go");
        boolean start=Boolean.parseBoolean(request.getParameter("go"));
        if(start==false){
            html = "testing";
            out.println(html);
            return "images";
        }

        return "images";
    }
}