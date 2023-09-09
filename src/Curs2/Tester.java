package Curs2;

public class Tester {
	
	//variabile
	
	String nume;
	int varsta;
	int ratePerHour = 1;
	String senioritate;
	String sex;
	
	//constructori
	//constructor default
	//public Tester() {
		
	// }
	public Tester(int salariuPeOra) {
		ratePerHour = salariuPeOra;
	}
	
	public Tester(int salariuPeOra, int varsta, String denumire, String senioritate, String sex) {
		this.ratePerHour = salariuPeOra;
		this.varsta = varsta;
		this.nume = denumire; //self in Python
		this.senioritate = senioritate;
		this.sex = sex;
		
		
	}
	//metode

}
