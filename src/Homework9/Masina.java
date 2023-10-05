package Homework9;

public class Masina extends Vehicul{

	public Masina(String brand, String nivelPoluare, int vitezaMedie) {
		
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}

		public String nume() {
			
			return "Masina";
		}
		
		public String monitorizare() {
		
			return "Monitorizare";
		}
	
		
			
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina" + getBrand() + "este :5 si viteza medie atinsa este de " + getVitezaMedie() +  "km/h");
	}
	
	}

