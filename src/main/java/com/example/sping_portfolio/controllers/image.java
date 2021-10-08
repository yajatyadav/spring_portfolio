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

    public static String[] imginput = new String[10];
    //might create arrays for the base64 and other outputs

    @GetMapping("/images")
    public String Images(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
    HttpServletResponse response) throws IOException{
        model.addAttribute("name", name);

        //setup array list, list each img file in array
        imginput[0]= "pizza.jpg";
        imginput[1]= "burrito.jpg";
        imginput[2]= "flower.jpg";
        imginput[3]= "milk.jpg";
        imginput[4]= "Mona_Lisa.jpg";
        imginput[5]= "yummy.jpg";
        imginput[6]= "cursed-meme.jpg";
        imginput[7]= "boku.jpg";
        imginput[8]= "noo.jpg";
        imginput[9]= "unnamed.jpg";

        //set up html output
        PrintWriter out = response.getWriter();
        String html = "";

        //check for button press
        String start = request.getParameter("go");
    if(start.equals("Convert!")){

        // loop to generate output values
        for(int i=0; i<imginput.length;i++){

        }
           return "images";
    }

    //exception handler
    else if(start==null){
        return "images";
    }

        return "images";
    }
}

class output{
    public String files(int i){
        return "0";
    }
}
class base64 extends output{
    public String files(int i){
        return "0";
    }
}
class rgb extends output{
    public String files(int i){
        return "0";
    }
}
class hexadecimal extends output{
    public String files(int i){
        return "0";
    }
}
class binary extends output{
    public String files(int i){
        return "0";
    }
}
class decimal extends output{
    public String files(int i){
        return "0";
    }
}