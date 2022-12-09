package PracticeJava;

public class Fibonacci {

	public static void main(String[] args) {
		int zero=0;
		int first=1;
		int next;
		System.out.println(zero);
		System.out.println(first);
		for(int i=2;i<9;i++){
			next=zero+first;
			zero=first;
			first=next;
			System.out.println(next);
		}
	}

}
