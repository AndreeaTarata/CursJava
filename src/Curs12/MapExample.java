package Curs12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>(); // key nu pot fi duplicate, dar valrile pot fi
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Dev");
		map.put("M", "Manager");
		map.put("P", "Product Owner");
		
		System.out.println(map.size());
		
		System.out.println(map.get("T"));
		
		System.out.println(map);
		map.put("T", "Automation");
		System.out.println(map);
		
		System.out.println("------------");
		
		System.out.println("Contains key:" + map.containsKey("Automation"));
		System.out.println("Contains key:" + map.containsValue("Automation"));
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("------------");
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("------------");
		System.out.println(map.size());
		map.remove("T");
		System.out.println(map.size());
		
		System.out.println("------------");
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		map.replace("D", "Director");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
	}

}
