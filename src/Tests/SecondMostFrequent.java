package Tests;


import java.util.HashMap;

//5. Write a Java program to find the second most frequent character in a given string
//The given string is: successes
public class SecondMostFrequent {

	public static void main(String[] args) {
		String str="successes";
		char[] charArr=str.toCharArray(); 
		char ans=' ';
		int first=0,second=0;
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:charArr){
			if(!map.containsKey(c)){
				map.put(c, 1);
				System.out.println(map);
			}	
			else{
				map.put(c, map.get(c)+1);
				System.out.println(map);
			}	
				
		}
		System.out.println(map);
		for(char c:map.keySet()){
			if(map.get(c)>first){
				second=first;
				first=map.get(c);
				System.out.println("first= "+first);
				System.out.println("second= "+second); 
				
			}
			else if(map.get(c)>second && map.get(c)<first){
				System.out.println("map.get(c)="+map.get(c));
				second=map.get(c);
				ans=c;
				
			}
				
		}
		System.out.println("Second most frequent character is "+ans);
	}

}
