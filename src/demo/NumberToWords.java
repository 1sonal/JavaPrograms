package demo;

public class NumberToWords {

	public static String numToWord(int n,String s){
		String[] oneDigit={"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] twoDigit={"elevan","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tensMultiple={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	//	String[] oftenMultiple={"hundred","thousand"};
	//	int n=896;
		String str="";
		
			
		if(n<=99&&n>19)
			str+=tensMultiple[n/10]+oneDigit[n%10];
		else 
			str+=oneDigit[n%10];
		if(n>0)
			str+=s;
		
		return str;
	}
	
	public static String convertToWord(int n){
		String result="";
		result+=numToWord(n/1000,"thousand");
		result+=numToWord((n/100)%10,"hundred");
		result+=numToWord((n/10)%10,"");
		result+=numToWord(n%10,"");
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(convertToWord(3452));
	}

}
