package Tests;
//9.Find duplicate value from an array.
public class Duplicate {

	public static void main(String[] args) {
		int[] arr={2,3,2,4,3};
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}

	}

}
