package Homework11;

import java.util.Properties;
import java.io.*;

public class WriteCalories { 

	public void writePropertiesFile() {

		try (OutputStream outPutStream = new FileOutputStream("calorii.properties")) {

			Properties listaCalorii = new Properties();
			listaCalorii.setProperty("morcov", "58");
			listaCalorii.setProperty("rosie", "12");
			listaCalorii.setProperty("salata", "20");
			listaCalorii.setProperty("ridiche", "35");
			listaCalorii.setProperty("castravete", "45");

			listaCalorii.store(outPutStream, "am salvat fisierul cu calorii legume");
			// outPutStream.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	public void readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("calorii.properties")) {

			Properties listaCalorii = new Properties();
			listaCalorii.load(inputStream);
			

	
			System.out.println(listaCalorii.getProperty(key));

		} catch (IOException e) {
			System.out.println("Nu vindem aceasta leguma! Va rugam alegeti alta!");
			e.printStackTrace();
			

		}
	}
}


