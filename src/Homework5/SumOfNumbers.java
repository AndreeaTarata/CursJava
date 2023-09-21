package Homework5;

import java.util.Scanner;

public class SumOfNumbers {
	int num;

	public void askTheUser() {

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

	}

	public void askUserTenNumbers() {

		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Please enter number: "+ i);
			askTheUser();
			suma += num;

		}
		System.out.println(suma);

	}

}
