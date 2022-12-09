package stringPrgm;
//1.	Write a java program to count the total number of occurrences of a 'a' character in a string ?  
public class Occurance {

	public static void main(String[] args) {
		String s = "Java is java again java again";
		int count=0;
		char[] charArr=s.toCharArray();
		for(int i=0;i<charArr.length;i++){
			if(charArr[i]=='a')
				count++;
		}
		System.out.println("Occurances of a= "+count);
	}

}
