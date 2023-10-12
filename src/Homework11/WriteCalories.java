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
	public String readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("calorii.properties")) {

			Properties listaCalorii = new Properties();
			listaCalorii.load(inputStream);
			
	
			return listaCalorii.getProperty(key); // daca am String/ Boolean, Integer vine cu Return la sfarsit

		} catch (IOException e) {
			
			e.printStackTrace();
			

		}
return null;
}
}


