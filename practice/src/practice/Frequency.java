package practice;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elemnet");
		String str = scanner.nextLine();
		str.toLowerCase();
		
		for(char c ='a'; c<='z'; c++) {
			
			int count= 0;
			for(int i=0; i<str.length();i++) 
			{
				if(c==str.charAt(i)) 
				{
					
					count++;
				}
				
			}	
			System.out.println(c+ "-"+ count);
			
		}
		
		
//		String s1 = "Tushar";
//
//		String s2 = "Mule";
//		
//		for(int i =s1.length()-1; i>=0; i--) {
//			System.out.print(s1.charAt(i));
//		}
//		System.out.println();
//		for(int j =s2.length()-1; j>=0; j--) {
//			System.out.print(s2.charAt(j));
//		}

	}

}
