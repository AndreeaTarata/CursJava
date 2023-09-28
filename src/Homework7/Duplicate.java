package Homework7;

public class Duplicate {

	public static void main(String[] args) {
		
		Duplicate obj = new Duplicate();
		obj.numaraDuplicate();
	}	
		
		public void numaraDuplicate() {
			
			String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
					"Bogdan", "Oana", "Ion"};	
		
			
			for(int i = 0; i < myStringArray.length; i++) {
				//System.out.println(myStringArray[i] + " i " + i);
				for(int j = i+1; j<myStringArray.length; j++) {
					//System.out.println(myStringArray[j] + " j " + j);
					if(myStringArray[i].equals(myStringArray[j])) {
						System.out.println("Nume duplicat: " + myStringArray[i]);
					}
				}
			}
			
			
			
		}
	

		}


