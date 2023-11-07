package practice;

import java.util.Scanner;

public class Bracket_Mistached {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String str = scanner.nextLine();
		int count1=0;
		int count2=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}
			 else if(str.charAt(i)==')'){
				count2++;
			}
		}
		
		if(count1==count2)
		{
			System.out.println("No error");
		}
		else
		{
			System.out.println("Error");
		}
	}
	

}
