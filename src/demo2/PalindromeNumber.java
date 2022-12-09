package demo2;
//recurssion
public class PalindromeNumber {
	public static int palindrome(int num,int reverse){
		
		if(num==0)
			return reverse;
		else{
			reverse=reverse*10+num%10;
			return palindrome(num/10,reverse);
		}			
	} 
	

	public static void main(String[] args) {
		int n=3232;
		int reverse=palindrome(n, 0);
		if(n==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
