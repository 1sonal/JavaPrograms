package Tests;
//1.Write a java program to count the total number of occurrences of a 'a' character in a string ? 
//		String s = "Java is java again java again";
public class TotalOccurances {
	static String s = "Java is java again java again";
	public static int occurances(){
		int count=0;
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)=='a')
				count++;
		}
		return count;
		
	}
	
	public static String removeSpaces(){
		
		return s.replaceAll("\\s", "");
	}
	
	public static void main(String[] args){
		System.out.println("count="+occurances()); 
		System.out.println("String without spaces:" +removeSpaces());
	}

}
