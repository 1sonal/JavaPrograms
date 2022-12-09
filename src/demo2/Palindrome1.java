package demo2;

public class Palindrome1 {

	public static void main(String[] args) {
		String str="Sonal123@456%&";
		/*String str1=str.replaceAll("[^0-9]", ""); 
		System.out.println("String with numbers:"+str1);*/
		
		String str2=str.replaceAll("[(a-z)&(A-Z)&(0-9)]", "");
		System.out.println("string with special characters:"+str2);
		
	}

}
