package demo;

public class MostFrequent {

	public static void main(String[] args) {
		String str="successes";
		char[] strArr=str.toCharArray();
		int frequent=1;
		for(int i=0;i<strArr.length;i++){
			int max=1;
			for(int j=i+1;j<strArr.length;j++){
				if(strArr[i]==strArr[j])
					max++; 
			}
			if(max>frequent){
				frequent=max;
				System.out.println(frequent);
				System.out.println("Most frequent="+strArr[i]);
			
			}
				
		}
		
	}

}
