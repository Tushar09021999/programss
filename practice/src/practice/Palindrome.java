package practice;

public class Palindrome {

		public static void main(String[] args) {
			
			int temp, sum=0, num, n=525;
			
			
			temp=n;
			while(n>0) {
				
				num = n%10;
				sum= sum*10+num;
				n = n/10;
				
				
			}
			if(temp==sum) {
				
				
				System.out.println("Palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			
			
		}
		
		
	}
