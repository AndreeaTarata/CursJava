package Curs12;

import java.util.Scanner;

public class SearchPostalCode {

	public static void main(String[] args) {
		
/*
 * Programul trebuie sa caute un oras pe baza unui cod postal dat de user
 * avem nevoie de o clasa care sa contina inca de la initializare o serie de coduri postale si orasele asociate cu ele( 6 orase)
 * daca codul nu exista
 * vreau sa aruncam postal code exception 
 * in cazul exceptiei vreau sa intreb din nou pana primesc un cod valid
 * 
 * 		
 */
		Scanner scan = new Scanner(System.in);
		PostalCodes pc = new PostalCodes();
		
		int codPostal;
		do {
			System.out.println("Please insert a postal code");
			codPostal = scan.nextInt();
			try {
				String oras = pc.findCity(codPostal);
				pc.findCity(codPostal);
				System.out.println("Orasul asociat codului:" + codPostal + "este" + oras);
			} catch (PostalCodeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}while(!pc.map.containsKey(codPostal));
	}

}
