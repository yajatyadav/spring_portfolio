package com.example.sping_portfolio.controllers;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.IOException;

//Code to grayscale an image
public class Grayscalecode {
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

	//grayscaling image
	public static String Grayscale(String path) throws IOException {

		//must put in try and catch block in case of exceptions, java can't handle it

		File image = new File(path);

		BufferedImage file = ImageIO.read(image);


		int width = file.getWidth();
		int height = file.getHeight();
		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {

				Color c = new Color(file.getRGB(j, i));
				int red = (int) (c.getRed() * 0.3);
				int green = (int) (c.getGreen() * 0.59);
				int blue = (int) (c.getBlue() * 0.11);
				Color newColor = new Color(red + green + blue,

						red + green + blue, red + green + blue);

				file.setRGB(j, i, newColor.getRGB());
			}
		}


		File output = new File("grayscale.jpg");
		ImageIO.write(file, "jpg", output);
//		image(file);

		return output.getAbsoluteFile().getPath();

	}



	//output image
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

}