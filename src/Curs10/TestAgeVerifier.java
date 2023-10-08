package Curs10;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {
		
		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enetr your age");
		int age = scan.nextInt();
		
		try {
			obj.checkAgeLimit(age);
		} catch (InvalidAgeException e) {
			
			e.printStackTrace();// printeaza tot istoricul erorilor de unde le ia
		}
		
		
		
		
	}

}
