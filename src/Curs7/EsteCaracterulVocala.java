package Curs7;

import java.util.Scanner;

public class EsteCaracterulVocala {

	public static void main(String[] args) {
		
		/*
		 * Facem un program care citeste o litera de la tastatura
		 * Verifica daca este vocala sau consoana (si cu if si cu switch)
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu o litera:");
		char litera = scan.next().charAt(0);
		
		// rezolvare cu IF
		
		if(litera =='a' || litera == 'A' || litera =='e' || litera == 'E' || litera =='o' || litera == 'O' || litera =='u' || litera == 'U'
				|| litera =='a' || litera == 'A') {
			System.out.println(litera + " Litera este vocala");
		}else {
			System.out.println(litera + " Nu este vocala");
		}
		
		// rezolvare cu switch
		
		switch(litera) {

		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			
			System.out.println(litera + " Litera este vocala");
			break;
		default:
			System.out.println(litera + " Nu este vocala");
		}
	}

}
