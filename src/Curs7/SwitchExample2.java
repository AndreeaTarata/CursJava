package Curs7;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
	
		/*Facem un program care verifica daca un student este eligibil pt o bursa
		 * Conditii:
		 * sa fie anul 3 pt bursa 1 
		 * sau sa aiba un punctaj de  80  bursa 
		 * sa aiba un punctaj de 50 bursa 2
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce an esti:");
		int an = scan.nextInt();
		
		
		
		switch(an) {
		case 1:
		case 2:
	
				System.out.println("Nu esti eligibil");
				break;
		case 3:
			System.out.println("Te rog introdu ce punctaj ai:");
			int punctaj = scan.nextInt();
			switch(punctaj) {
			case 80:
				System.out.println("Eligibil pt bursa 1");
				break;
			case 50:
				System.out.println("Eligibil pt bursa 2");
				break;
			default:
					System.out.println("Te rog introdu un pct valid");
			}
			break;
		default:
			System.out.println("Te rog sa introduci un an valid");
		}
	}

}
