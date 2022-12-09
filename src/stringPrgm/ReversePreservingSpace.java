package stringPrgm;
//10.	Write a java program to reverse a given string with preserving the position of spaces?
public class ReversePreservingSpace {

	public static void main(String[] args) {
//		String str = "hi welcome to Whizible";
		String str="aba";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
		if(sb.toString().equalsIgnoreCase(str))
			System.out.println("palindrome");
		
	}

}
