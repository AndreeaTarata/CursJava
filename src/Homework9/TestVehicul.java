package Homework9;

public class TestVehicul {
	
	public void verificaMonitorizarea(Masina masina) {
		
		System.out.println(masina.nume());
		//System.out.println(masina.monitorizare());
		
	}
		

	public static void main(String[] args) {
		
		
		
		Masina masina = new Masina("Mercedes", "MIC", 200);
		//Bicicleta bicicleta = new Bicicleta("Dacia", "MARE", 150);
		TestVehicul testvehicul = new TestVehicul();
		
		testvehicul.verificaMonitorizarea(masina);
		
		masina.detaliiVehicul();
			
		}
		

	

}
