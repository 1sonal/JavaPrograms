package demo2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Race";
		String str2="Care";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length()){
			char[] str1Arr=str1.toCharArray();
			char[] str2Arr=str2.toCharArray();
			
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			boolean bln=Arrays.equals(str1Arr, str2Arr);
			if(bln)
				System.out.println("Anagram");
			else
				System.out.println("not anagram");
			
		}
		else
			System.out.println("not anagram");

	}

}
