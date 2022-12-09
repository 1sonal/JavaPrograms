package stringPrgm;
//13.	Java Program to Reverse a String using Recursion.
public class Recursion {

	public static String reverseString(String str){
		if(str.length()<=0||str==null)
			return str;
		else{
	//		System.out.println("str="+str);
			return(reverseString(str.substring(1))+str.charAt(0));
		}	
	}
	public static void main(String[] args) {
		System.out.println(reverseString("anything"));
		

	}

}
