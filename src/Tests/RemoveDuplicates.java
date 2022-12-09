package Tests;
//8.Write a Java program to print after removing duplicates from a given string.
//Original String : "Ivavsys"
//Sample Output: "Ivasy"
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "Ivavsys";
	
		char[] str1=str.toCharArray();
		
		for(int i=0;i<str1.length;i++){
			for(int j=i+1;j<str1.length;j++){
				if(str1[i]==str1[j]){
					str1[j]='0';
					
				}
					
			}
			
		}
		for(int i=0;i<str1.length;i++){
			if(str1[i]!='0'){
				System.out.print(str1[i]);
			}
		}
		
		
	}

}
