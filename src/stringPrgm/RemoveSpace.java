package stringPrgm;
//2.	Write a java program to  removes the leading and trailing spaces from a string.? String s1="  hello   ";
//3.	Remove spaces from string String s1 = "t u t o r i a l s";
//Convert double value=23.34 into string 
//5.	  convert a char array to a string in Java.  ex: char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
public class RemoveSpace {

	public static void main(String[] args) {
		String s1="    hello   ";
		System.out.println(s1.trim());
		String s2 = "t u t o r i a l s";
		String[] stringArr=s2.split("\\s");
		for(String s:stringArr){
			System.out.print(s);
		}
		 double value=23.34;
		 System.out.println(String.valueOf(value));
		 char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		 
		 System.out.println(new String(ch));
		System.out.println(String.valueOf(ch));
	}

}
