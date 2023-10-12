package Curs12;

public class GenericExample {

	public static void main(String[] args) {
		
		
		printDetails("String");
		printDetails(20.23);
		printDetails(false);
		printDetails('x');
		
		printArgument(true, 1, "text");

	}
	
	public static <T> void printDetails(T obj) {// obiect de tip generics
		
		System.out.println("Obiect" + obj);
		System.out.println("Data type obiect" + obj.getClass().getName());
		
		
		
	}
	
	public static <T> void printArgument(T...values) {
		
		for(T elemet: values) {
			
			System.out.println(elemet);
		}
		
		
	}

}
