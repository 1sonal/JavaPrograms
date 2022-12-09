package stringPrgm;
//14.	Write a Java program to check whether a given string starts with the contents of another string.
public class StrartsWith {

	public static void main(String[] args) {
		String str1="Red is favorite color";
		String str2="Orange is also my favorite color";
		String strString="Red";
		
		boolean strt1=str1.startsWith(strString);
		boolean strt2=str2.startsWith(strString);
		
		if(strt1==true)
			System.out.println("str1 starts with "+strString);
		else 
			System.out.println("str1 does not start with "+strString);
		
		if(strt2==true)
			System.out.println("str2 starts with "+strString);
		else 
			System.out.println("str2 does not start with "+strString);
	}

}
