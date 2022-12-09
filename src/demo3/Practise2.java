package demo3;

public class Practise2 {

	public static void main(String[] args) {
	
		System.out.println(2);
		System.out.println("hi");
		
		String s1="abc";
		String s2=new String("abc");
		String s3=new String("abc");
		String s4="abc";
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s1==s4);//true
		System.out.println(s1.equals(s4));//true
		
		
		//== checks equality in mem loc
		//.equalTo checks equality in contents
	}

}
