package demo;

public class NumberOfWords {

	public static void main(String[] args) {
		String str="Hi hello everyone";
		String[] strArr=str.split(" ");
		
		int count=strArr.length;
//		for(int i=0;i<strArr.length;i++){
//			if(strArr[i].equals(" ")){
//				count++;
//			}
//		}

		System.out.println("Number of words="+count);
		
	}

}
