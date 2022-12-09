package stringPrgm;
//12.	Write a Java program to convert (PUNE) to (MRKB).
public class ConvertString {

	public static void main(String[] args) {
		String pune="PUNE";
		char[] chArr=pune.toCharArray();
		for(int i=0;i<chArr.length;i++){
			chArr[i]=(char) (chArr[i]-3);
		}
		for(int i=0;i<chArr.length;i++){
			System.out.print(chArr[i]);
		}
	}

}
