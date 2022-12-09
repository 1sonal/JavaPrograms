package Tests;

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr={2,5,7,8,9};
		for(int i=0;i<5;i++){
			if(arr[i]%2==0)
				System.out.println(arr[i]+"is even");
			else
				System.out.println(arr[i]+"is odd");
		}

	}

}
