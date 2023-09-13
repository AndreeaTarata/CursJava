package Curs3;

public class Homework3_TestResultPassOrFail {
	public static void main(String[] args) {
		
		Homework3_PassOrFail test = new Homework3_PassOrFail();
		//System.out.println(test.checkPassOrFail(52));
		test.askTheUserPunctajTest();
		System.out.println(test.checkPassOrFail(test.punctajTest));
				
		
	}

}
