package demo;


public class DuplicateString {
		public static void main(String[] args){
			String str="This This is is program";
		//	String[] strArr={"This This is is This program"};
			String[] strArr=str.split("\\s");
			int duplicate=0;
			for(int i=0;i<=strArr.length;i++){
				for(int j=i+1;j<strArr.length;j++){
					if(strArr[i].equalsIgnoreCase(strArr[j])){
						duplicate++;
					}
				}
			}
			System.out.println("Duplicate="+duplicate); 
		}
}
