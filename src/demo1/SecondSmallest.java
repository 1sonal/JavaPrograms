package demo1;
//Write a Java program to find the second smallest element in an array
public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr={-9,-7,4,2,0};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
			System.out.println("Second smallest element: "+arr[1]);
		

	}

}
