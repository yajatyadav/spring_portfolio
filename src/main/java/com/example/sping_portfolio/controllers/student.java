package com.example.sping_portfolio.controllers;

public class student {


      void average_grade(double math_grade, double science_grade, double history_grade) {
        double avg = (math_grade + science_grade + history_grade);
        avg = avg / 3;



        if (avg >= 90) {
            System.out.println("Your Student is Average");
        }
        else{
            System.out.println("Your Student is Below Average");
        }

    }
    public static void main(String[] args) {
        student Kyle = new student();
        Kyle.average_grade(85, 96, 88);
    }
}


