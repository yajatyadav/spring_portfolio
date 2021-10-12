//package com.example.sping_portfolio.controllers;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
////Code to grayscale an image
//public class Grayscalecode2 {
//	public static void main(String[]args) throws IOException{
//
//		boolean userinput =false;
//		//receive user input for file directory of image
//		//i don't know how else I'm supposed to get an image to grayscale :P
//
//		//no idea how this input form gonna look for user
//		while(!userinput) {
//			//Scanner filename= new Scanner(System.in);
//			//System.out.println("Enter image pathway(ex:C:\\Users\\image.jpg)): ");
//			String file = JOptionPane.showInputDialog("Enter image pathway(ex:C:\\Users\\image.jpg)): ");
//
//
//			//converts filename to String file
//			//String file=filename.next();
//			File check=new File(file);
//
//
//			//checks existence of file
//			if(check.exists()) {
//
//				//performs grayscale of image if file exists
//
//				Grayscale(check);
//				userinput = true;
//				//	filename.close();
//			}
//			else {
//				//puts user in loop to force them to submit correct filename
//				userinput=false;
//
//				//lol have no idea if user will see this text
//				//System.out.println("It appears your image does not exist, please try again.");
//				JFrame f;
//				f=new JFrame();
//				JOptionPane.showMessageDialog(f,"It appears your image does not exist, please try again.");
//			}
//		}
//
//	}
//
//	//grayscaling image
//	public static void Grayscale(File image) {
//
//		//must put in try and catch block in case of exceptions, java can't handle it
//		try {
//			BufferedImage file=ImageIO.read(image);
//			int width=file.getWidth();
//			int height=file.getHeight();
//			for(int i=0; i<height; i++) {
//
//				for(int j=0; j<width; j++) {
//
//					Color c = new Color(file.getRGB(j, i));
//					int red = (int)(c.getRed() * 0.299);
//					int green = (int)(c.getGreen() * 0.587);
//					int blue = (int)(c.getBlue() *0.114);
//					Color newColor = new Color(red+green+blue,
//
//							red+green+blue,red+green+blue);
//
//					file.setRGB(j,i,newColor.getRGB());
//				}
//			}
//			File ouptut = new File("grayscale.jpg");
//			ImageIO.write(file, "jpg", ouptut);
//			image(file);
//
//			return ouptut.getAbsoluteFile();
//
//
//
//		}
//		catch(Exception e) {
//
//		}
//
//
//	}
//	//output image
//	public static void image(BufferedImage file) {
//		JFrame frame = new JFrame();
//		Image dimg=file.getScaledInstance(file.getWidth(), file.getHeight(),
//				Image.SCALE_SMOOTH);
//		ImageIcon icon = new ImageIcon(dimg);
//		JLabel label = new JLabel(icon);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//		frame.add(label);
//		frame.setDefaultCloseOperation
//				(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
//
//	}
//
//}