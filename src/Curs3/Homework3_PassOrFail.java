package Curs3;

import java.util.Scanner;

public class Homework3_PassOrFail {

		int punctajTest;
		
		public void askTheUserPunctajTest() {
			
			System.out.println("Insert punctaj test: ");
			Scanner scan = new Scanner(System.in);
			punctajTest = scan.nextInt();
		}

		
		public String checkPassOrFail(int punctajTest) {
			
			if(punctajTest > 0 && punctajTest <= 65) {
				return "Ai picat. Mai incearca!";
				
			}else if(punctajTest < 0) {
				return("Numarul introdus nu este valid. te rog introdu un numar pozitiv!");
						
			}else {
				return "Felicitari ai trecut";
			}
	}

}
