package practice;

import java.util.Scanner;

public class Accourance {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		String str = "Tushar";
		String x =str.toLowerCase();
		
		System.out.println("enter element");
		char c = scanner.next().charAt(0);
		
		int count=0;
		
		
		for(int i=0; i<str.length(); i++) {
			
			if(c==x.charAt(i)) {
				count++;
				
			}
			
			
		}
		System.out.println(count);



}
}
