package Curs9;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
    		System.out.println("Numbers from 1 to 100 are:" + i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    

}

}


