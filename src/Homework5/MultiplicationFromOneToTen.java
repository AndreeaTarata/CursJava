package Homework5;

import java.util.Scanner;

public class MultiplicationFromOneToTen {

	
	int num;
	
	public void askTheUserForANumber() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter number: ");
	num = scan.nextInt();
	System.out.println(num);
	scan.close();
	
	}
	
	
	public void MultiplicateTheNumber() {
		
		askTheUserForANumber();
		for(int i = 1; i <=10; i++) {
			System.out.println(num + "*" + i + " = " + num*i);
		}
	}
}
