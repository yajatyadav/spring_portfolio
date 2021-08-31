package com.example.sping_portfolio.controllers;

public class Avg {
    public static void main(String[] args) {
        double grade1;
        grade1 = 90;
        System.out.println("Score One is " + grade1);

        double grade2;
        grade2 = 94;
        System.out.println("Score Two is " + grade2);

        double avg12;
        avg12 = (grade1 + grade2) / 2;
        System.out.println("Average of the first two is " + avg12);

        double grade3 ;
        grade3  = 99;
        System.out.println("Score Three is " + grade3);

        double grade4 ;
        grade4  = 98;
        System.out.println("Score Four is " + grade4);

        double avg34;
        avg34 = (grade3 + grade4) / 2;
        System.out.println("Average of the second two is " + avg34);

        double grade5;
        grade5 = 93;
        System.out.println("Score Five is " + grade5);

        double finalAvg;
        finalAvg = (avg12 + avg34 + grade5) / 3;
        System.out.println("Final Average is " + finalAvg);

        double weightedAvg;
        weightedAvg = (avg12 * 2 + avg34 * 2 + grade5) / 5;
        System.out.println("Weighted Average is " + weightedAvg);

    }
}
