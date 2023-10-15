package Homework12;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsArray {

	public static void main(String[] args) {
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c'};
		ordoneazaArray(textArray);
		ordoneazaArray(intArray);
		ordoneazaArray(charArray);
		
	}
	
		public static <T> void ordoneazaArray(T...values) {
			
		
				
				Arrays.sort(values);
				for(T elemet: values) {
					
					System.out.println(elemet);
				}
				
				
			
		}
	}


