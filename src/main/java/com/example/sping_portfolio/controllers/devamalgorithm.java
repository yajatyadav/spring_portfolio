package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class devamalgorithm extends HttpServlet{
    String calculation = "";
    @GetMapping("/devamalgorithm")
    public String devam_about(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {
        model.addAttribute("name", name); // MODEL is passed to html

        String method = request.getParameter("ImpMethod");

//        String method = "For";
//        String layer = request.getParameter("Rows");
        int layer = Integer.parseInt(request.getParameter("Row of Pascal Triangle"));
//        int layer = 7;

        System.out.println(method);
        if(method.equals("For")) {

            pascalfor test = new pascalfor();

            this.calculation = test.calculatepascalrow(layer);
//            test.calculatepascalrow(1);
//            test.calculatepascalrow(2);
//            test.calculatepascalrow(3);
//            test.calculatepascalrow(4);
//            test.calculatepascalrow(5);
        } else if (method.equals("Recursion")) {
            pascalrecursion test2 = new pascalrecursion();
            this.calculation = test2.calculatepascalrow(layer);
//            test2.calculatepascalrow(2);
//            test2.calculatepascalrow(3);
//            test2.calculatepascalrow(4);
//            test2.calculatepascalrow(5);
//            test2.calculatepascalrow(0);
        } else if (method.equals("Matrix")) {
            pascalmatrix test3 = new pascalmatrix();

            this.calculation = test3.calculatepascalrow(layer);
//            test3.calculatepascalrow(1);
//            test3.calculatepascalrow(2);
//            test3.calculatepascalrow(3);
//            test3.calculatepascalrow(4);
//            test3.calculatepascalrow(5);
        } else if (method.equals("While")) {
            pascalwhile test4 = new pascalwhile();

            this.calculation = test4.calculatepascalrow(layer);
//            test4.calculatepascalrow(1);
//            test4.calculatepascalrow(2);
//            test4.calculatepascalrow(3);
//            test4.calculatepascalrow(4);
//            test4.calculatepascalrow(5);
        }

        PrintWriter writer = response.getWriter();

        System.out.println(this.calculation);
        // build HTML code
        String htmlRespone = "";
        htmlRespone += "<footer>Your returned Pascal Triangle Layer for method '" + method + "'  and desired layer " + layer + " is: <br/>";
        htmlRespone += this.calculation + "</footer>";
        htmlRespone += "";

        // return response
        writer.println(htmlRespone);
        return "devamalgorithm";

    }

    abstract class pascaltriangle {
        abstract String calculatepascalrow(int n);
        public int factorial(int i)
        {
            if (i == 0)
                return 1;
            return i * factorial(i - 1);
        }
    }

    interface pascalcalculation{
        public int pascal(int i, int j);
    }

    class pascalfor extends pascaltriangle{
        String calculatepascalrow(int n) {
            String a = "";
            pascalfor p = new pascalfor();
            for (int j = 0; j<= n; j++) {
                a += " " + p.factorial(n) / (p.factorial(n-j) * p.factorial(j));
            }
            return a;
        }
    }

    class pascalrecursion extends pascaltriangle implements pascalcalculation{
        String calculatepascalrow(int n){
            String a = "";
            for (int j = 0; j<= n; j++) {
                a += " " + pascal(n,j);
            }
            return a;
        }

        @Override
        public int pascal(int i, int j){
            if (j == 0 || j == i) {
                return 1;
            } else {
                return pascal(i - 1, j - 1) + pascal(i - 1, j);
            }
        }
    }



    class pascalmatrix extends pascaltriangle implements pascalcalculation{
        public int[][] matrix;
        String calculatepascalrow(int n){
            String a = "";
            this.matrix = new int[n+1][n+1];
            for (int i = 0; i <= n; i++){
                for(int j = 0; j<= i; j++){
                    pascal(i,j);
                    if (i == n) {
                        a += " " + this.matrix[i][j];
                    }
                }
            }
            return a;
        }
        @Override
        public int pascal(int i, int j){
            if (j == 0 || j == i) {
                this.matrix[i][j] = 1;
                return 1;
            } else {
//            System.out.println("i = " + this.matrix[i-1][j]+ "j = " + this.matrix[i-1][j-1]);
                this.matrix[i][j] = this.matrix[i-1][j-1] + this.matrix[i-1][j];
                return 1;
            }
        }
    }

    class pascalwhile extends pascaltriangle{
        String calculatepascalrow(int n) {
            pascalwhile p = new pascalwhile();
            int j = 0;
            String a = "";
            while (j<= n) {
                a += " " + p.factorial(n) / (p.factorial(n-j) * p.factorial(j));
                j++;
            }
            return a;
        }
    }
}

//public class devamalgorithm {
//    public static void main(String[] args) {
//
//    }
//}

