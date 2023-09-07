package Curs2;

public class Tester {
	
	//variabile
	String nume;
	int varsta;
	int ratePerHour = 1;
	
	//constructori
	//constructor default
	//public Tester() {
		
	// }
	public Tester(int salariuPeOra) {
		ratePerHour = salariuPeOra;
	}
	
	public Tester(int salariuPeOra, int varsta, String denumire) {
		this.ratePerHour = salariuPeOra;
		this.varsta = varsta;
		this.nume = denumire; //self in Python
		
		
	}
	//metode

}
