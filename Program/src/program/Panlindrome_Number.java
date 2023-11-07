package program;

public class Panlindrome_Number {
	public static void main(String[] args) {
		int num,sum=0, n=121;
		int temp = n;
		while(n>0) {
			
			num = n%10;
			sum = sum*10+num;
			n = n/10;
			
			
		}
		if(sum==temp) {
			
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
		
	}

}
