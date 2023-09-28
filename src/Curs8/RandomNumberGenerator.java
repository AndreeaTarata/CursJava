package Curs8;

import java.util.Arrays;
import java.util.Random;

/*
 * program care genereaza 6 numere random intre 0 si 9
 * numerelele se tine intr-un array
 * nu tine numere duplicate
 * printeaza arrayul
 * 
 * o metoda care genereaza si pune in array
 * o metoda pt duplicate
 * o metoda pt print array
 * 
 */

public class RandomNumberGenerator {

	final int LENGHT = 6;
	final int MAX_NUMBERS = 9;
	int[] numbers = new int[LENGHT];
	
	
	public void generateNumbers() {
		Random random = new Random();
		
		random.nextInt(MAX_NUMBERS);
		System.out.println(random.nextInt(MAX_NUMBERS));
		
		for(int i = 0; i < LENGHT; i++){
			//numbers[i] = random.nextInt(MAX_NUMBERS);
			int randomNR = 0;
			
			do {
				
			randomNR = random.nextInt(MAX_NUMBERS);
			}while(checkDuplicateNumber(numbers, randomNR));
			//System.out.println(numbers[i]);
			//System.out.println(Arrays.toString(numbers));
			numbers[i] = randomNR;
			
		}
	}
		
		public boolean checkDuplicateNumber(int[] array, int nr) {
			
			for(int number : array) {
				if(number == nr) {
					return true;
				}
			}return false;
			
			
			
		}
		
		
		public void printArray() {
			
			for(int nr: numbers) {
				System.out.print(nr + " | ");
		}
		

	}
		
		
	}

