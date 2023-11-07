package practice;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		
		int count=0;
		
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("enter number");
		int x = scanner.nextInt();
		for (int i = 1; i <= x; i++) {
			if(x%i==0) {
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
