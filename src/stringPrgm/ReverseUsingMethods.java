package stringPrgm;
//20.	Write a Java program to reverse every word in a string using methods. 
public class ReverseUsingMethods {

	public static void main(String[] args) {
		String str= "This is a test string";
		String[] strArr=str.split(" ");
		String reverse="";
		for(String s:strArr){
			StringBuilder sb=new StringBuilder(s);
			reverse+=sb.reverse().toString()+" ";
		}
		System.out.println(reverse);
		
	}

}
