package practice;

public class PalindromeString {
	public static void main(String[] args) {
		
		String str = "jaaj";
		
		String temp = "";
		
		
		for(int i =str.length()-1; i>=0;i--) {
			
			temp = temp+ str.charAt(i);
			
			
		}
		
		if(str.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}
	
	

}
