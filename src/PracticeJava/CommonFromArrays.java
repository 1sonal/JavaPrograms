package PracticeJava;

import java.util.Arrays;

public class CommonFromArrays {

	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5};
		int[] arr2={1,2,3,4,5};
		int count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
					count++;
			}
			if(count>0){
				System.out.println(arr1[i] +" repeated");
				count=0;
			}	
		}
		System.out.println("are two arrays equal? "+Arrays.equals(arr1, arr2));
	}

}
