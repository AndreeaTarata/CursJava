package Curs11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	public void writeFile(String text) { //ce vreau sa sxriu in int acelui fisier - string text, writeFile("Ana are mere")
		
		try {
			FileWriter myFileWriter = new FileWriter("file.txt");
			myFileWriter.write(text);
			myFileWriter.close();
			System.out.println("Sucessfully wrote into the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can't wrote into the file");
		}  // filewritter stie sa scrie intr-un fisier)
		
		
	}

	
	
	public void readTxtFile() {
		
		
		try {
			File objFile = new File("file.txt");
			Scanner scan = new Scanner(objFile);
				while(scan.hasNext()) {
					System.out.println(scan.nextLine());
				}
			
			scan.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
}
