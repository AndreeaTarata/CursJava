package Homework5;

import java.util.Scanner;

public class SumOfNumbers {
	int num;

	public void askTheUser() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		num = scan.nextInt();

	}

	public void askUserTenNumbers() {

		for (int i = 0; i < 10; i++) {

			askTheUser();

		}

	}

	public void sumTenNumbers() {
		int counter = 0;
		int suma = 0;

		for (int i = 0; i < 10; i++) {
			counter++;
			suma += num;
		}
		System.out.println(suma);
	}
}
