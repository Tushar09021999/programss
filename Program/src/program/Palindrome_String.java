package program;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "daaad";
		String rev = "";
		
		for( int i = str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		
		
		if(rev.toLowerCase().equals(str.toLowerCase())) {
			
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}
