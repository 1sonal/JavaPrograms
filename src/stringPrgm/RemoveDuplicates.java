package stringPrgm;

import java.util.HashSet;
import java.util.Set;

//18.	Write a Java program to print string after removing duplicates from a given string.
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "Whiziblee";
		int duplicate=0;
		String result="";
		int i;
		char[] chArr=str.toCharArray();
		for(i=0;i<chArr.length;i++){
			for(int j=i+1;j<chArr.length;j++){
				if(chArr[i]==chArr[j])
						chArr[j]=' ';
			}
		}	
		result=String.valueOf(chArr);
		String result1=result.replaceAll(" ", "");
		
		System.out.println("After removing duplicates: "+result1);
		
		
	}

}
