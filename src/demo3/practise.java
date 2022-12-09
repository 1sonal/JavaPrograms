package demo3;

public class practise {

	public static void main(String[] args) {
		String str="a1b2c3d4e5";
		String str1=str.replaceAll("[a-z]","");
		int num=Integer.parseInt(str1);
		
		int sum=0;
		while(num!=0){
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
