package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */



import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Base64;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class image {

    public  String[] imginput = new String[10];
    public String[] base  = new String[10];
    public String[] binarys = new String[10];
    public String[] dec = new String[10];
    public String[] color = new String[10];
    public String[] hex = new String[10];
    public BufferedImage[] gray = new BufferedImage[10];

    //might create arrays for the base64 and other outputs

    @GetMapping("/images")
    public String Images(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
    HttpServletResponse response) throws IOException{
        model.addAttribute("name", name);

        //setup array list, list each img file in array
        imginput[0]= "harryunfortunately.png";
        imginput[1]= "Capture.PNG";
        imginput[2]= "donuts.jpg";
        imginput[3]= "milk.jpg";
        imginput[4]= "Mona_Lisa.jpg";
        imginput[5]= "yummy.jpg";
        imginput[6]= "cursed-meme.jpg";
        imginput[7]= "boku.jpg";
        imginput[8]= "noo.jpg";
        imginput[9]= "unnamed.jpg";

        //set up html output
        PrintWriter out = response.getWriter();
        String html = "";


        //check for button press
        String start = request.getParameter("go");
    if(Objects.equals(start, "Convert!")){

        // loop to generate output values
        for (int i=0; i<imginput.length;i++) {

            output a;

            //PLS NOTE THAT NONE IF THIS IS TESTED TO SEE IF IT WORKS OR NOT
            //might output values to an array if that is needed

            //calls to calculate base64
            a = new base64();
            base[i] = a.files(imginput[i]);


            //calls to calculate binary
            a = new binary();
            binarys[i] = a.files(imginput[i]);

            //calls to calculate decimal
            a = new decimal();
            dec[i] = a.files(imginput[i]);

            //calls to calculate rgb
            a = new rgb();
            color[i] = a.files(imginput[i]);

            //calls to calculate hexadecimal
            a = new hexadecimal();
            hex[i] = a.files(imginput[i]);

            //grayscale
            grayscale b = new grayscale();
            File pic = new File(imginput[i]);
            BufferedImage pic2 = ImageIO.read(pic);
            gray[i] = b.convert(pic2);

        }

           return "images";
    }

    //exception handler
    else if(start==null){
        return "images";
    }

        return "images";
    }

}

//polymorphism
//outputs, don't know if polymorphism is best to accomplish this
class output{
    public String files(String i) throws IOException{
        return "0";
    }
}

//img to base64
class base64 extends output{
    public String files(String i){
        //converts image to file var
        File file = new File(i);
        String encodedfile;

        //exception handler
        try (FileInputStream fileInputStreamReader = new FileInputStream(file)){

         byte[] imageData = new byte[(int) file.length()];
         fileInputStreamReader.read(imageData);
         encodedfile = Base64.getEncoder().encodeToString(imageData);

     }

     catch(Exception e) {
         return "Image to base64 conversion has encountered an error";
     }
        return encodedfile;
    }
}


//img to rgb
class rgb extends output{
    public String files(String i){


        return "0";
    }
}

//img to hex
class hexadecimal extends output{
    public String files(String i){
        return "0";
    }
}

//img to binary
class binary extends output{
    public String files(String i){
        return "0";
    }
}

//img to decimal
class decimal extends output{
    public String files(String i){
        return "0";
    }
}

//calculate grayscale
class grayscale {
    public BufferedImage convert(BufferedImage file){
        try {
            int width=file.getWidth();
            int height=file.getHeight();
            for(int k=0; k<height; k++) {

                for(int j=0; j<width; j++) {

                    Color c = new Color(file.getRGB(j, k));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,

                            red+green+blue,red+green+blue);

                    file.setRGB(j,k,newColor.getRGB());
                }
            }
            File ouptut = new File("grayscale.jpg");
            ImageIO.write(file, "jpg", ouptut);

        }
        catch(Exception e) {
            return file;
        }
        return file;
    }
}