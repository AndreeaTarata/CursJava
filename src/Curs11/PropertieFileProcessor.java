package Curs11;

import java.util.Properties;
import java.io.*;

public class PropertieFileProcessor { // properties = are structura cheie, valoare deci de map

	public void writePropertiesFile() {

		try (OutputStream outPutStream = new FileOutputStream("test.properties")) {

			Properties propFile = new Properties();
			propFile.setProperty("user", "TestUser");
			propFile.setProperty("email", "TestUser@test.com");
			propFile.setProperty("browser", "TestUser");
			propFile.setProperty("user", "Firefox");
			propFile.setProperty("url", "test");

			propFile.store(outPutStream, "am salvat fisierul");
			// outPutStream.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("test.properties")) {

			Properties propFile = new Properties();
			propFile.load(inputStream);

			System.out.println(propFile.getProperty(key));

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void updatePropertiesFile(String key, String value) {

		Properties propFile = new Properties();
		
		// incarc fisierul
		try(OutputStream outPutStream = new FileOutputStream("test.properties")) {
			propFile.setProperty(key, value);
			propFile.store(outPutStream, "am salvat fisierul");	
		}catch(IOException e) {
			e.printStackTrace();
		}
		

		

	}
}
