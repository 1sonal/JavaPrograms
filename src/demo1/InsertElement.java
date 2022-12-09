package demo1;
//Write a Java program to insert an element (specific position) into an array
public class InsertElement {

	public static void main(String[] args) {
		int[] arr={90,78,56,34,79,12,34};
		int[] otherArr=new int[arr.length+1];
		for(int i=0,j=0;i<arr.length;i++){
			if(i==3){
				otherArr[i]=83;
				j++;
			}	
			otherArr[j]=arr[i];
			j++;
		}
		for(int j=0;j<otherArr.length;j++){
			System.out.print(otherArr[j]+",");
		}

	}

}
