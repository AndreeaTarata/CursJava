package Homework6;


public class Fibonacci {
	public static void main(String[] args) {
		int howMany = 9;
		int first = 0, second = 1;
		System.out.print("Secventa Fibonacci: ");
		
/*	
	
	
	  
	for(int i = 0; i < howMany; i++) {

	
	System.out.println(first + "");
	int sum = first + second;
	first = second;
	second = sum;
	
		
	
		
	}}}

*/	
		int i = 0;
		int sum = 0;
		while(i < howMany) {
			System.out.println(first + "");

			sum = first + second;
			first = second;
			second = sum;
			i++;
			
		}
			
		}}
	

