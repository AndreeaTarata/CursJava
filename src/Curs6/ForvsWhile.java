package Curs6;

import java.util.Scanner;

public class ForvsWhile {

	public static void main(String[] args) {
		/*
		 * facem un program care ii cere userului numere incontinuu le inmuteste cu 10 -
		 * face asta pana userul introduce 0 daca a introdus 0 facem Exit din loop
		 * 
		 */
		//rezolvareCuFor();// daca e statica o putem chea direct
		rezolvareCuWhile();
	}

	public static void rezolvareCuFor() {
		// rezolvarea cu for este anormala - nu face sens

		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		if (nr == 0) {

		} else {
			for (;;) {
				System.out.println(nr * 10);
				System.out.println("Please enter a number :");

				nr = scan.nextInt();
				if (nr == 0) {
					break;
				}
			}
		}

	}

	public static void rezolvareCuWhile() {
		
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		while(nr !=0) {
			System.out.println(nr * 10);
			System.out.println("Please enter a number :");
			nr = scan.nextInt();
			
			
			
		}
	}
		
}
