package com.example.sping_portfolio.controllers;

public class minilab_3 {
     int unread_email = 0;
     int important_email = 0;

     public minilab_3(int unread, int important){
         unread_email = unread;
         important_email = important;

     }

      void Unread_Checker() {
         if (!(unread_email <= 0)) {
             System.out.println("You have unread email");

         } else {
             System.out.println("You have no unread email");
         }
     }

     void Important_Checker() {

         if (!(important_email <= 0)) {
             System.out.println("You have important email");

         } else {
             System.out.println("You have no important email");
         }
     }

    public static void main(String[] args) {

         minilab_3 User = new minilab_3(5, 0);
         User.Unread_Checker();
         User.Important_Checker();

    }
}
