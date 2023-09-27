package Curs7;

public class FindIndexOfElement {
	
	/*
	 * Avem un array
	 * si facem o metoda prin care vrem sa aflam indexul unui element
	 * ex de print : index pt el 8 este 3
	 */

	int[] numbers = {3, 5, 7, 8, 9, 22, 4};
	public static void main(String[] args) {
		FindIndexOfElement obj = new FindIndexOfElement();
		//obj.rezolvareCuFor(8);
		obj.rezolvareCuForEach(8);
		
	}
	public void rezolvareCuFor(int element) {
		
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] == element) {
				System.out.println("Index pt element" + element + "este" +i);
			}
			
		}}
	
	// for each
	public void rezolvareCuForEach(int element) {
			int counter = 0;
		for(int numar : numbers) {
			if(numar == element) {
				System.out.println("Index pt element" + element + "este" +counter);
			}
			counter++;
		}
		
	}
	

}
