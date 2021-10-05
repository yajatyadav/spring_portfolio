/*
package com.example.sping_portfolio.controllers;

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
public class kylealgorithm extends HttpServlet{
    public static int num;
    public static int total4;
    @GetMapping("/kylealgorithm")
    public String kyle_algorithm(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
                                  HttpServletResponse response) throws IOException{
        model.addAttribute("name", name);

        if(request.getParameter("input1")==null){
            return "kylealgorithm";
        }
        else {
            num = Integer.parseInt(request.getParameter("input1"));
            String html = "";
                html = "<footer style=\"position:absolute; top:30%; right:20%;border: medium solid black;\">Answer:1</footer>";

                extension2 forrecursion = new extension2();
                int total1 = forrecursion.thing(num);
                method run;
                run = new whileloop();
                int total2 = run.calculating(num);
                run = new streamrecursion();
                int total3 = run.calculating(num);
            return "kylealgorithm";
        }
    }
}

//  For loop will add the current iteration number to the total until the limit is reached
abstract class for_recursion{
    public abstract void calculating();
    public int thing(int limit){
        int total = 1;
        for (int i = 1; i <= limit; i++) {
            total = i + total;
        }
        return total;
    }
}

class extension2 extends for_recursion{
    public void calculating(){
    }
}

class recursion2 implements calculation2 {
    public void recursion1() {
        int total = recursionmethod(kylealgorithm.num);
        System.out.println(total);
        kylealgorithm.total4=total;
    }


    public static int recursionmethod(int limit){
        if (limit > 1){
            return limit + recursionmethod(limit - 1);
        }
    }
}

//  Limit
interface calculation2{
    public void recursion2();
}
class method2{
    public int calculating(int limit){
        return 0;
    }
}

//  While loop will add to the total from the top number down, until the iteration count hits the limit
class whileloop extends method2{
    public int calculating(int limit){
        int i = 0;
        int adding = limit;
        int total = 0;
        while(limit > i) {
            i++;
            total = total + adding;
            adding = adding - 1;
        }
        return total;
    }
}

// Stream method will continue to add the numbers for each between 1 and the input limit
class streamrecursion extends method2{
    public int calculating(int limit) {
        Long total= LongStream.rangeClosed(1, limit).reduce(1, (long a, long b ) -> a + b);
        total = total.intValue();
        return total;
    }
}
*/

 
