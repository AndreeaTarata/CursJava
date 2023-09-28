package Curs8;

public class Square extends Shape {

	public Square(String culoare, String nume) {
		super(culoare, nume); // super e un fel de this
		
	}

	String nume = "Patrat";
	String culoare = "Galben";
	
	public void printDetails() {
		
		
		System.out.println("Numele este " + super.nume + "si culoarea este " + super.culoare);
	}
	
}
