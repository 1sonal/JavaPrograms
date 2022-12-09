package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to remove a specific element from an array
public class RemoveElement {

	public static void main(String[] args) {
		int[] arr={23,45,67,89,90,25,15};
	//	List<Integer> list=new ArrayList<Integer>();
		int[] otherArr=new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++){
			if(arr[i]==67){
				continue;
			}
			otherArr[j++]=arr[i];
		}
		for(int k=0;k<otherArr.length;k++){
			System.out.print(otherArr[k]+",");
		}	

	}

}
