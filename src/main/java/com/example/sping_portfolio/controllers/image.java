package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */


import java.io.ByteArrayOutputStream;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Base64;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.List;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class image {

    public static BufferedImage Grayscale(String path) throws IOException {


        File image = new File(path);

        BufferedImage file = ImageIO.read(image);


        int width = file.getWidth();
        int height = file.getHeight();
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                Color c = new Color(file.getRGB(j, i));
                int red = (int) (c.getRed() * 0.3);
                int green = (int) (c.getGreen() * 0.6);
                int blue = (int) (c.getBlue() * 0.1);
                Color newColor = new Color(red + green + blue,

                        red + green + blue, red + green + blue);

                file.setRGB(j, i, newColor.getRGB());
            }
        }


//        File output = new File("test" + ".jpg");
//        ImageIO.write(file, "jpg", output);

        return file;

    }


    public static void image(BufferedImage file) {
        JFrame frame = new JFrame();
        Image dimg = file.getScaledInstance(file.getWidth(), file.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(dimg);
        JLabel label = new JLabel(icon);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }








////            return output.getAbsoluteFile().getPath();
//        return image;


    //
//
    public static java.util.List<String> ImageList() {
        java.util.List<String> images = new ArrayList<>();
        images.add("/images/donuts.jpg");
        images.add("/images/milk.jpeg");
        images.add("images/pizza.jpg");
        images.add("/images/toastcat.jpg");

        return images;
    }

    public static java.util.List<BufferedImage> GrayImageList () throws IOException {
        java.util.List<BufferedImage> grayimages = new ArrayList<>();
        grayimages.add(Grayscale("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\donuts.jpg"));
        grayimages.add(Grayscale("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\milk.jpeg"));
        grayimages.add(Grayscale("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\pizza.jpg"));
        grayimages.add(Grayscale("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\toastcat.jpg"));

        return grayimages;

    }

    public static java.util.List<String> save_image() throws IOException {
        java.util.List<BufferedImage> grayimages = GrayImageList();
        ArrayList<String> filepaths = new ArrayList<String>();
        for(int x=0; x<grayimages.size(); x++){
            File output = new File("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\" + x + ".jpg");
            ImageIO.write(grayimages.get(x), "jpg", output);
            String filename = "/images/" + x + ".jpg";
            filepaths.add(filename);
        }
        return filepaths;
    }


//    @GetMapping("/images")
//    public String Grayscale (Model model) throws IOException {
//        model.addAttribute("image_list", ImageList());
//        model.addAttribute("gray_image_list", save_image());
//        return "/images";
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedImage image2 = Grayscale("C:\\Users\\simvi\\Desktop\\School\\CSP\\spring_portfolio\\src\\main\\resources\\static\\images\\donuts.jpg");
//            image(image2);
        System.out.println(GrayImageList());
        List<String> filepath = save_image();
        System.out.println(filepath);




    }

    public String[] imginput = new String[10];
    public String[] base  = new String[10];
    public String[] binarys = new String[10];
    public String[] dec = new String[10];
    public String[] color = new String[10];
    public String[] hex = new String[10];

    //might create arrays for the base64 and other outputs

    @GetMapping("/images")
    public String Grayscale (Model model) throws IOException {
        model.addAttribute("image_list", ImageList());
        model.addAttribute("gray_image_list", save_image());
        return "/images";

    }
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

           //grayscale is handled by yajat




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
class rgb extends output {
    public String files(String i) throws IOException{
            int red = 0;
            int blue=0;
            int green=0;

            File file=new File(i);
            BufferedImage img= ImageIO.read(file);

            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {

                    //Retrieving contents of a pixel
                    int pixel = img.getRGB(x,y);

                    //Creating a Color object from pixel value
                    Color color = new Color(pixel, true);

                    //Retrieving the R G B values
                     red = color.getRed();
                     green = color.getGreen();
                     blue = color.getBlue();
                }
            }
            String values =Integer.toString(red) + green + blue;

            return values;
    }
}

//img to hex
class hexadecimal extends output{
    public String componentToHex(int c) {
        String hex = Integer.toHexString(c);
        return hex.length() == 1 ? "0" + hex : hex;
    }

    public String rgbToHex(int r, int g, int b) {
        return "#" + componentToHex(r) + componentToHex(g) + componentToHex(b);
    }
        }

//img to binary
class binary extends output{
    public String componentToBinary(int c) {
        String binary = Integer.toBinaryString(c);
        int topad = 8-binary.length();
        return "0".repeat(topad) + binary;
    }

    public String rgbToBinary(int r, int g, int b) {
        return 'b' + componentToBinary(r) + componentToBinary(g) + componentToBinary(b);
    }
}

//img to decimal
class decimal extends output{
    public String files(String i) { return "0"; }
}

//calculate grayscale
//class grayscale
    /*
    public static BufferedImage convert(String f) {
        File file = new File(f);
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
            int width = image.getWidth();
            int height = image.getHeight();
            for (int k = 0; k < height; k++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, k));
                    int red = (int) (c.getRed() * 0.299);
                    int green = (int) (c.getGreen() * 0.587);
                    int blue = (int) (c.getBlue() * 0.114);
                    Color newColor = new Color(red + green + blue,

                            red + green + blue, red + green + blue);

                    image.setRGB(j, k, newColor.getRGB());
                }
            }
            File ouptut = new File("grayscale.jpg");
            ImageIO.write(image, "jpg", ouptut);
            return image;
        } catch (Exception e) {

        }
        return image;
    }
}
*/
