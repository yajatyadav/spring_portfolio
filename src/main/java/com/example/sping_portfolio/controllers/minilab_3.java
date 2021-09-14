package com.example.sping_portfolio.controllers;

public class minilab_3 {
    static int unread_email = 0;
    static int important_email = 0;

    public static void main(String[] args) {
        if (!(unread_email <= 0)) {
            System.out.println("You have unread email");

        } else {
            System.out.println("You have no unread email");
        }

        if (!(important_email <= 0)) {
            System.out.println("You have important email");

        } else {
            System.out.println("You have no important email");
        }
    }
}
