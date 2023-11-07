package practice;

public class ReverseEachWord {

	public static void main(String[] args) {

		
		
		String str="my name is tushar";

		String[] s = str.split(" ");
		String newString="";
		
		for (int i = 0; i < s.length; i++) {
		 String word = s[i];
		 String rev="";
		 for(int j =word.length()-1; j>=0;j--) {
			 
			 rev = rev+word.charAt(j);
			 
			
		 }
		  newString = newString+rev+" ";
			
		}
		System.out.println(str);
		System.out.println(newString);
		
//		for(int i= str.length()-1; i>=0;i--) {
//			char ch = str.charAt(i);
//			System.out.print(str.charAt(i));
//			
//		}
	}
}


