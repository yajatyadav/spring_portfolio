//package com.example.sping_portfolio.controllers;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;



//@Controller
//public class Grayscale_controller {


//    public static BufferedImage Grayscale(String path) throws IOException {


//        File image = new File(path);

//        BufferedImage file = ImageIO.read(image);


//        int width = file.getWidth();
//        int height = file.getHeight();
//        for (int i = 0; i < height; i++) {

//            for (int j = 0; j < width; j++) {

//                Color c = new Color(file.getRGB(j, i));
//                int red = (int) (c.getRed() * 0.299);
//                int green = (int) (c.getGreen() * 0.587);
//                int blue = (int) (c.getBlue() * 0.114);
//                Color newColor = new Color(red + green + blue,

//                        red + green + blue, red + green + blue);

//                file.setRGB(j, i, newColor.getRGB());
//            }
//        }


//        File output = new File("test" + ".jpg");
//        ImageIO.write(file, "jpg", output);

//        return file;

//    }


//    public static void image(BufferedImage file) {
//        JFrame frame = new JFrame();
//        Image dimg = file.getScaledInstance(file.getWidth(), file.getHeight(),
//                Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(dimg);
//        JLabel label = new JLabel(icon);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.add(label);
//        frame.setDefaultCloseOperation
//                (JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);

//    }








//            return output.getAbsoluteFile().getPath();
//        return image;


//        public static List<String> ImageList() {
//            List<String> images = new ArrayList<>();
//            images.add("/images/donuts.jpg");
//            images.add("/images/milk.jpeg");
//            images.add("images/pizza.jpg");
//            images.add("/images/toastcat.jpg");

//            return images;
//        }

//        public static List<BufferedImage> GrayImageList () throws IOException {
//            List<BufferedImage> grayimages = new ArrayList<>();
//            grayimages.add(Grayscale("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\donuts.jpg"));
//            grayimages.add(Grayscale("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\milk.jpeg"));
//            grayimages.add(Grayscale("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\pizza.jpg"));
//            grayimages.add(Grayscale("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\toastcat.jpg"));

//            return grayimages;

//        }

//        public static List<String> save_image() throws IOException {
//        List<BufferedImage> grayimages = GrayImageList();
//        ArrayList<String> filepaths = new ArrayList<String>();
//            for(int x=0; x<grayimages.size(); x++){
//                File output = new File("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\" + x + ".jpg");
//                ImageIO.write(grayimages.get(x), "jpg", output);
//                String filename = "/images/" + x + ".jpg";
//                filepaths.add(filename);
//        }
//            return filepaths;
//    }

//        @GetMapping("/images")
//        public String Grayscale (Model model) throws IOException {
//            model.addAttribute("image_list", ImageList());
//            model.addAttribute("gray_image_list", save_image());
//            return "/images";

//        }

//        public static void main(String[] args) throws IOException {
//            BufferedImage image2 = Grayscale("C:\\Users\\Yajat\\IdeaProjects\\spring_portfolio\\src\\main\\resources\\static\\images\\donuts.jpg");
//            image(image2);
//            System.out.println(GrayImageList());
//            List<String> filepath = save_image();
//            System.out.println(filepath);
//        }
//}