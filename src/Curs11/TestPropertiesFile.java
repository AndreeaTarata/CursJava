package Curs11;

public class TestPropertiesFile {

	public static void main(String[] args) {
		
		
		PropertieFileProcessor obj = new PropertieFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("email");
		obj.updatePropertiesFile("email", "nimic@nimic");
		obj.readPropertiesFile("email");
		

	}

}
