package stringPrgm;

public class DemoClass {

	public static void main(String[] args) {
		String str="Verve square Technologies Pvt ltd";
		/*String[] strArr=str.split("\\s");
		for(int i=0;i<strArr.length;i++){
			System.out.print(strArr[i]);
		}*/
		String strNew=str.replace(" ", "");
		System.out.print(strNew);
	}

}
