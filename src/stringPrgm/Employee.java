package stringPrgm;

import java.util.HashMap;

public class Employee {
	static HashMap<Integer, String> map=new HashMap<>();
	public static void main(String[] args) {
		
		map.put(1, "sonal");
		map.put(2, "Aditi");
		map.put(3, "Vasanti");
		map.put(4, "Pratiksha");
		System.out.println(map);
		map.remove(3);
		System.out.println(map); 
		map.put(3, "Neha");
		System.out.println(map);
		getData();

	}
	
	public static void getData(){
		System.out.println(map.get(3));
		
	}
		
	} 


