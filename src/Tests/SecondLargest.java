package Tests;
//11.Find 2nd largest no from array
public class SecondLargest {

	public static void main(String[] args) {
		int[] arr={4,2,8,9,1};
		int temp;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
	}

}
