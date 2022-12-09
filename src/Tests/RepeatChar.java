package Tests;

import java.util.Arrays;

//6.Write a Java program to repeat every character twice in the original string.
//The given string is: welcome
//The new string is: wweellccoommee
public class RepeatChar {

	public static void main(String[] args) {
		String str= "welcome";
		char[] str1=str.toCharArray(); 
		for(int i=0;i<str1.length;i++){
			System.out.print(str1[i]);						
			System.out.print(str1[i]);	
			
			}
			
		

	}

}
