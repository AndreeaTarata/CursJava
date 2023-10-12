package Curs12;

import java.util.HashSet;
import java.util.Set;

public class FinDuplicatesArray {
	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();
		String[] names = {"Ion", "Oana", "Maria", "Ion", "Oana", "Bobo"};
		
		for(int i = 0; i < names.length; i++) {
			
			for (int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j]))
					//System.out.println("Nume duplicate" + names[i]);
				set.add(names[i]);
				
		}
		}
		for(String name: set) {
			System.out.println("Nume duplicat" + name);	
	}
	
	}
}
