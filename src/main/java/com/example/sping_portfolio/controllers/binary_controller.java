package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class binary_controller {
    @GetMapping("/binary")
    public String binary(@RequestParam(name="user_bits", required=false, defaultValue="8") int user_bits, Model model) {

        model.addAttribute("bits", user_bits);
        return "binary"; // returns HTML VIEW
    }
//    @RequestMapping("/hello")
//    public String display(HttpServletRequest request, Model model) {
//        String bits = request.getParameter("user_bits");
//        model.addAttribute("bits", bits);
//        return "binary";
//    }

}



//package com.example.spring_portfolio.controllers;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class binary_controller {
//
//    @GetMapping("/binary")
//    public String binary(@RequestParam(name = "name", required = false, defaultValue = "x") String name, Model model) {
//        model.addAttribute("name", 5);
////
//        return "binary";
//}
////    @RequestMapping("binary")
////    public String showForm() {
////        return "binary";
////    }
////    @RequestMapping(value = "showdata", method = RequestMethod.GET)
////    public String showdata(HttpServletRequest request, Model model) {
////        String bits = request.getParameter("user_bits");
////        model.addAttribute("bits", bits);
////        return "binary";
////    }
//
//
////    public class user_bits{
////        private int bits;
////    }
////    @GetMapping("/binary")
////    public String binary(@RequestParam(name = "name", required = false, defaultValue = "x") String name,  Model model) {
////        model.addAttribute("bits", request.getParameter("user_bit"));
////
////        return "binary";
////    }
//
////
////    @ModelAttribute
////    public void bit_value(Model model){
////        model.addAttribute("user_bit", 5);
////    }
//
////
////    private List<user_bits> changer(){
////        return Arrays.asList(new user_bits());
////
//
//    }
