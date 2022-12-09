package demo;

public class PalindromeString {

	public static void main(String[] args) {
//		String str="abcbah";
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println(sb.reverse());
//		String reverse=sb.reverse().toString();
//		if(str.equals(reverse))
//				System.out.println("Palindrome");
//		else
//			System.out.println("not palindrome");
		
		
		 String myString = "abcbah";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
				

	}

}
