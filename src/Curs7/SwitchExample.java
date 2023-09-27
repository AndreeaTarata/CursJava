package Curs7;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * intrebam userul un calificativ
	 * in fct de calificativ printam
	 * A -->  Felicitari
	 * B -> Destul de bine
	 * C --> suficient
	 * D -> insuficient
	 * Daca introduce orice altceva ii spunem nota invalida 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un calificativ:");
		String calificativ = scan.next();
		
		switch(calificativ.toUpperCase()) {
		case "A": 
			System.out.println("Felicitari");
			break;

		case "B": 
			System.out.println("Destul de bine");
			break;

		case "C": 
			System.out.println("Suficient");
			//break;

		case "D": 
			System.out.println("Insuficient");
			break;

		default:
			System.out.println("Nota invalida");
		}
		
		
		

}
}
