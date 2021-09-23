//no errors in code, just Spring compatibility issues
package Grayscalecode;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.awt.*;

//Code to grayscale an image, integrate this somehow ig
public class Grayscalecode {
	public static void main(String[]args) throws IOException{

		boolean userinput =false;
	//receive user input for file directory of image
	//i don't know how else I'm supposed to get an image to grayscale :P

	//no idea how this input form gonna look for user
		while(userinput==false) {
			Scanner filename= new Scanner(System.in);
			System.out.println("Enter image pathway(ex:C:\\Users\\image.jpg)): ");


		//converts filename to String file
			String file=filename.next();
			File check=new File(file);


		//checks existence of file
			if(check.exists()) {

		//performs grayscale of image if file exists

				Grayscale(check);
				userinput = true;
				filename.close();
			}
			else {
		//puts user in loop to force them to submit correct filename
				userinput=false;

		//lol have no idea if user will see this text
				System.out.println("It appears your image does not exist, please try again.");
			}
		}

  }

//grayscaling image
	public static void Grayscale(File image) {

		//must put in try and catch block in case of exceptions, java can't handle it
		try {
		BufferedImage file=ImageIO.read(image);
		int width=file.getWidth();
		int height=file.getHeight();
		  for(int i=0; i<height; i++) {

	            for(int j=0; j<width; j++) {

	               Color c = new Color(file.getRGB(j, i));
	               int red = (int)(c.getRed() * 0.299);
	               int green = (int)(c.getGreen() * 0.587);
	               int blue = (int)(c.getBlue() *0.114);
	               Color newColor = new Color(red+green+blue,

	               red+green+blue,red+green+blue);

	               file.setRGB(j,i,newColor.getRGB());
	            }
	         }
	         //File won't output, need to figure that out
		  //then maybe link it and put new image onto an html page somehow
	         File ouptut = new File("grayscale.jpg");
	         ImageIO.write(file, "jpg", ouptut);
		}
		catch(Exception e) {

		}


	}
}