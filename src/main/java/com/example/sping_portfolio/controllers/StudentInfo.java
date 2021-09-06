package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentInfo {
    public static void main(String[] args){

        String name = "Adhithi";

        double avgGrade;
        avgGrade = 97.90;

        final int numClass;
        numClass = 5;
        boolean atDelNorte;
        atDelNorte = true;

        System.out.println(name + " has an average grade of " + avgGrade);

        System.out.println(name + " is taking " + numClass + " classes.");

        System.out.println(name + " is currently at Del Norte for the 2021-22 school year: " + atDelNorte);

    }}