package Curs12;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();
		System.out.println(set.size());
		System.out.println(set.isEmpty());

		
		set.add("Mov");
		set.add("galben");
		set.add("rosu");
		set.add("alb");
		set.add("verde");
		set.add("galben");
	
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println("------------");
		System.out.println(set.contains("mov"));
		
		set.remove("alb");
		System.out.println("------------");
		System.out.println(set);
		// nu are valori duplicate si nu are index
	}
	
}
