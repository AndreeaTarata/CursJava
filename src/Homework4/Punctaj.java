package Homework4;

import java.util.Scanner;

public class Punctaj {
	Double punctaj;
	String evaluare;
	
	public void askPuntaj() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Punctajul obtinul este ");
		punctaj = scan.nextDouble();
		
	}
	
	public void evaluarePunctaj () {
		
		
		
		evaluare = (punctaj >= 90)? "FB" : (punctaj >= 80 && punctaj <90)? "B" : "S";
		System.out.println(evaluare);
		
					
	}
	public void rezultat() {
		askPuntaj();
		evaluarePunctaj();
		String mesaj;
		mesaj = (evaluare.equals("FB"))? "Ai primit: FoarteBine " : 
			(evaluare.equals("B"))? "Ai primit: Bine" : 
			(evaluare.equals("S"))? "Ai primit: Suficient ":
				"Evaluare necunoscuta";
		System.out.println(mesaj);
	}

}
