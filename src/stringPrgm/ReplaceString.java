package stringPrgm;
//6.	Replace a substring inside a string by another one ? String str = "View timesheet create timesheet"; replace timesheet to record.
//Write a Java program to get a substring of a given string between two specified positions.
public class ReplaceString {

	public static void main(String[] args) {
		String str = "View timesheet create timesheet";
		String str1=str.replace("timesheet", "record");
		System.out.println(str1);
		
		String old = "The quick brown fox jumps over the lazy dog.";
		String newString=old.substring(10, 25);
		System.out.println(newString); 
	}

}
