package Homework9;

public class Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
	
	public String nume() {
		
		return "";
	}
	
	public String monitorizare() {
	
		return "";
	}
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina Dacia este :5 si viteza medie atinsa este de 180 km/h");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
		System.out.println("Nivelul de poluare pentru masina Dacia este :5 siviteza medie atinsa este de 180 km/h");
	}
}
