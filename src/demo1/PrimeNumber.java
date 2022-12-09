package demo1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag=0;
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num!=0){
			for(int i=2;i<num/2;i++){
				if(num%i==0){
					flag=0;
					break;
				}
					
				else
					flag=1;
			}
		}
		if(flag==1)
			System.out.println("prime number");
		else
			System.out.println("not prime");

	}

}
