package stringPrgm;
//19.	Write a Java program to divide a string in n equal parts. 
public class DivideInEqualParts {

	public static void main(String[] args) {
		String str= "abcdefghijklmnopqrstuvwxy";
		int n=5;
		String[] strArr=new String[5];
		int temp=0;
		
		if(str.length()%n!=0)
			System.out.println("The given string can not be divided in "+n+" equal parts");
		else
			for(int i=0;i<str.length();i=i+str.length()/n){
				strArr[temp]=str.substring(i, i+str.length()/n);
				temp++;

			}
		
		for(int j=0;j<strArr.length;j++)
			System.out.println(strArr[j]);
	}

}
