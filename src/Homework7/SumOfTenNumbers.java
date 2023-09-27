package Homework7;

import java.util.Scanner;

public class SumOfTenNumbers {

	public static void main(String[] args) {
		
		SumOfTenNumbers obj = new SumOfTenNumbers();
		obj.sumOfNumbers();
		
	}
		int[] numere = new int[10];
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
	
		
		public void sumOfNumbers() {
			
			System.out.println("Introdu 10 numere: ");

			for(int i : numere) {
				
				
				
				
				int numar = scan.nextInt();
				numere[i] = numar;
				//System.out.println(numere[i]);
				sum += numar;
				
				
				
			}System.out.println("Suma numerelor din array este: " + sum);
			
		
	}

}
