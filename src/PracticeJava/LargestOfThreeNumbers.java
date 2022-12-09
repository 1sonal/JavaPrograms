package PracticeJava;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=500,b=77,c=13;
		int largest=a;
		if(a<b&&b>c)
			largest=b;
		else if(a<c)
			largest=c;
		System.out.println("Largest= "+largest);
			
	}

}
