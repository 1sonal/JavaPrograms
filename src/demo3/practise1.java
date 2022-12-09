package demo3;

public class practise1 {

	public static void main(String[] args) {
		String[] strArr={"a1","b2","c3","d4","e5"};
		String[] strArrNew=new String[strArr.length];
		for(int i=0;i<strArrNew.length;i++){
			strArrNew[i]=strArr[i].replaceAll("[a-z]", "");
			
		}
		int sum=0;
		for(int i=0;i<strArrNew.length;i++){
			sum=sum+Integer.parseInt(strArrNew[i]);
		}

	
		System.out.println(sum);
	}

}
