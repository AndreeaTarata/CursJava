package Curs8;

public class TestShape {

	public static void main(String[] args) {
	
		
		Square patrat = new Square("Rosu", "cerc");
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume); // daca comentam valorile in Square el va printa ce ii dam aici - daca nu va printa ce e in super

		
		patrat.printDetails();
	}

}
