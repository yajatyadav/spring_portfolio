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

@Controller
public class harryalgorithm extends HttpServlet{
    public static int num;
    public static int result4;
    @GetMapping("/harrylalgorithm")
    public String harry_algorithm(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
                                  HttpServletResponse response) throws IOException{
        model.addAttribute("name", name);

        //null input handling
        if(request.getParameter("input1")==null){
            return "harrylalgorithm";
        }
        else {
            //read from js
            num = Integer.parseInt(request.getParameter("input1"));
            PrintWriter out = response.getWriter();
            String html = "";

            //lol do we really need to go through so much cpu just to calculate a simple factorial
            if (num == 1 || num == 0) {
                System.out.println("1");

                html = "<footer style=\"position:absolute; top:30%; right:20%;border: medium solid black;\">Answer:1</footer>";
                out.println(html);

            //calculate more harder factorial
            } else {
                // call for abstract class
                extension myabstractrecursion = new extension();
                int result = myabstractrecursion.thing(num);

                //starts polymorphism
                method a;

                a = new while1();
                int result2 = a.calc(num);

                a = new stream();
                int result3 = a.calc(num);

                //call for interface
                recursion myrecursion = new recursion();
                myrecursion.recursion1();


                //html
                html += "<footer style=\"position:absolute; top:30%; right:20%;border: medium solid black;\">for: " + result + "<br>";
                html += "while: " + result2 + "<br>";
                html += "stream: " + result3 + "<br>";
                html += "recursion: " + result4 + "</footer>";
                html += "";
                out.println(html);
            }

            return "harrylalgorithm";
        }
    }
}
//abstract class for forloop
abstract class abstractrecursion{
    public abstract void calc();
    public int thing(int k){
        int total=1;
        for (int i=1; i<=k; i++) {
            total = i * total;
        }
        return total;

    }
}
class extension extends abstractrecursion{
    public void calc(){

    }
}

//what interface call for recursion
class recursion implements calculation {
    public void recursion1() {
        int total=recursion2(harryalgorithm.num);
        System.out.println(total);
        harryalgorithm.result4=total;
    }


    public static int recursion2(int k) {
        if (k > 1) {
            return k * recursion2(k - 1);
        } else {
            return 1;

        }

    }
}

//interface
interface calculation{
    public void recursion1();
}




//polymorphism
class method{
    public int calc(int k) {
        return 0;
    }
}
//while loop
class while1 extends method{
    public int calc(int k) {
        int i=0;
        int j=k;
        int total=1;
        while(k>i) {
            i++;
            total=total*j;
            j=j-1;

        }
        return total;
    }
}
//stream method
class stream extends method{
    public int calc(int k) {
        Long total= LongStream.rangeClosed( 1, k).reduce(1, (long a, long b ) -> a * b);
        int t=total.intValue();
        return t;
    }
}
