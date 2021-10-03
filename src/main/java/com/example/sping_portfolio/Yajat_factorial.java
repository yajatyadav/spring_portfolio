package com.example.sping_portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


public abstract class Yajat_factorial {
    static int size;
    static String name;
     static long final_value;


    public Yajat_factorial(int n) {
        this.size = n;
        this.name = ".";
        this.final_value = 1;
        this.init();


    }

    protected abstract void init();
//
//    public long getNth(){
//        return list.get(size-1);
//    }

    public void setValue(long output) {
        final_value = output;

    }

    public static long getValue() {
        return final_value;
    }

    public static String getName() {
        return name;
    }

    public static void print() {
        System.out.println(name);
        System.out.println("Value is " + Long.toString(final_value));
//
    }

    public static void main(String[] args) {



    }
}
