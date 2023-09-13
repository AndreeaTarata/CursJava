package Curs3;

import java.util.Scanner;

public class Homework3_Age {
	
	int varsta;
	
	public void askAge() {
		
		System.out.println("Ce varsta ai? ");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		
	}
	public String estiMinorSauBatran(int varsta) {
		
		if(varsta > 0 && varsta < 18) {
			return "Esti minor!";
		
		}else if (varsta < 0) {
			return "Te rog introdu o varsta mai mare decat 0."
					+ " Numarul introdus este negativ!";
			
		
		}else if (varsta >=18 && varsta <= 65) {
			return "Esti adult!";
			
		}else {
			return "Esti batran!";
		}
	}

}
