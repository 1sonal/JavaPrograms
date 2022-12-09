package stringPrgm;
//9.	Write a Java program to repeat every character twice in the original string.
public class RepeatChar {

	public static void main(String[] args) {
		String str="welcome";
		String newString="";
	//	char[] charArr=str.toCharArray();
		for(int i=0;i<str.length();i++){
			newString+=str.substring(i, i+1)+str.substring(i, i+1);
		}
		System.out.println(newString);
	}

}
