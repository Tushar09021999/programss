package practice;

public class Duplicate_String {
	
	public static void main(String[] args) {
		
	
	
	String str = "my name is tushar";
	char[] s = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	      if (s[i] ==s[j]) {
	    	  
	         System.out.print(s[j] + " ");
	         break;
	      }
	   }
	}
}	
}
