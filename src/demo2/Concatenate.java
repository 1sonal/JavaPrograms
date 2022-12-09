package demo2;

public class Concatenate {

	public static void main(String[] args) {
		String s1="ABC";
		String s2="PQR";
		String s3="XYZ";
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
	}

}
