package PracticeJava;



public class PrimeNumber {

	public static void main(String[] args) {
		int num=23;
		int prime=0;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				prime=0;
				break;
			}	
			else if(num%i!=0)
				prime=1;
		}

		if(num==1)
			System.out.println("1 is prime number");
			
		if(prime==1)
			System.out.println("The number is prime");
		else
			System.out.println("Not prime"); 
	}

}
