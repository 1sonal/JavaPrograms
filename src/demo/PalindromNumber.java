package demo;

public class PalindromNumber {

	public static void main(String[] args) {
		int intNumber=56765;
		int original=56765;
		int n1,n2,result=0;
		while(intNumber!=0){
			
			n2=intNumber%10;
			result=result*10+n2;
			intNumber=intNumber/10;
			
		}
		if(original==result){
			System.out.println("Palindrome"); 
			
		}
		else
			System.out.println("not palindrome");
	}

}
