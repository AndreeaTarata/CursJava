package Homework12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCatalog {
	Map<String, Integer> map = new HashMap<>();
	// MapCatalog catalog = new MapCatalog();

	public MapCatalog() {

		map.put("Ion", 8);
		map.put("Andreea", 10);
		map.put("Elena", 6);
		map.put("Dorel", 8);

	}

	public void conditiiAdaugare() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numele tau: ");
		String numeElev = scan.nextLine();
		System.out.println("Introdu nota ta: ");
		int nota = scan.nextInt();
		
		
		if(nota > 0 && nota < 10) {
			if(!map.containsKey(numeElev)) {
			map.put(numeElev, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!" + map);
			
			}else if(map.containsKey(numeElev) && nota < map.get(numeElev)) {
			System.out.println("Nu ai nevoie de alta nota, ai nota: " + map.getOrDefault(numeElev, nota));
			System.out.println(map);
			}else if(map.containsKey(numeElev) && nota > map.get(numeElev)) {
		map.replace(numeElev, nota);
		System.out.println("Am inlocuit nota, ai nota: " + map.getOrDefault(numeElev, nota));
		System.out.println(map);
		}
	}else {
		System.out.println("Va rog introduceti o nota valida");
	
		}
}
}
