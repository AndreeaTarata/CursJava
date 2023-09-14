package Curs4;
/*
 * Facem un calc care are operatiile +(adunare), -(scadere)
 * *(inmultire), /(impartire)
 * Intrebam userul primul numar
 * intrebam userul operatia matematica
 * intrebam userul al doilea numar 
 * printam rezultatul;
 * ex: 2+2 = 4
 * 
 * 
 */

import java.util.Scanner;

public class SimpleCalculator {
	int num1, num2;
	char operator;
	int result;
	
	
	/*
	 * masina  masina.charAt(3) = i
	 * 012345  masina.lenght ==6
	 * 
	 * 
	 */
	
	private void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter second number: ");
		num2 = scan.nextInt();
		System.out.println("Please enter operation: ");
		operator = scan.next().charAt(0);
		
	
		
				
	}
	
	public void simpleCalculator() {
		askTheUser();
		boolean flag = true;// adoua varianta, prima fiind cu apelarea metodei prinResult(). Boolean flag este varianta mai curata
		
		
		if( operator == '+') {
			result = num1 + num2;
			printResult();
			//System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if( operator == '-') {
			result = num1 + num2;
			printResult();
			//System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if( operator == '+') {
				result = num1 + num2;
				printResult();
				//System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if( operator == '+') {
			result = num1 + num2;
			printResult();
			//System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else {
			System.out.println("Wrong operation");
			flag = false;
		}
		if(flag) {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			
		}
			//System.out.println(num1 + " " + operator + " " + num2 + " = " + result)
		
	}

	
    public void printResult() {
    	System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
