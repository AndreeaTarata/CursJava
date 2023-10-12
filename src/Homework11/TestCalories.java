package Homework11;

import java.util.Scanner;

public class TestCalories {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce leguma doriti sa cumparati?");
		String leguma = scan.nextLine();
		scan.close();
		
		WriteCalories scrieCalorii = new WriteCalories();
		 
		scrieCalorii.writePropertiesFile();
		
		if(scrieCalorii.readPropertiesFile(leguma) != null) {
			System.out.println(scrieCalorii.readPropertiesFile(leguma));
		}else {
			System.out.println("Nu vindem aceasta leguma");
		}
		

	}

}
