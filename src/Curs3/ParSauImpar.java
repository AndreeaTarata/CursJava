package Curs3;

import java.util.Scanner;

/*
 * Program care verifica daca un numar este par sau impar
 * daca numarul este par: printeaza numarul este par
 * daca este impar : printeaza este impar
 * 
 * 
 * 
 */
public class ParSauImpar {
	
	int number;
	public void askTheUserForANumber() {
		
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}
		
	public int askTheUserForANumber2() {
		
		// alt fel fara a declara variabila la inceput
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		return number;
	}

	public String checkOddOrEven(int number) {
		if(number % 2 == 0 ) {
			return "Number is even!";
			
			
		}else {
			
			return "Number is odd!";
			
		}
		
	}
	
		public String checkOddOrEven2() {
			if(askTheUserForANumber2()
					% 2 == 0 ) {
				return "Number is even!";
				
				
			}else {
				
				return "Number is odd!";
				
			}
	}

}
