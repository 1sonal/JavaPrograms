package Tests;

public class RemoveSpacesInString {
	static String s = "Java is java again java again";
	public static String removeSpaces(){
		
		return s.replaceAll("\\s", "");
	}
	
	public static void main(String[] args){
		
		System.out.println("String without spaces:" +removeSpaces());
	}
}
