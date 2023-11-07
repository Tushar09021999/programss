package practice;

import java.util.Scanner;

public class RemoveDuplicateArray {
	
	
	public static void main(String[] args) {		
		
		int[] x = {0,0,1,2,2,3,3,4,5,5,6,6,6,7};
		int[] temp = new int[x.length];
		int j = 0;
		
		for(int i = 0; i< x.length-1 ; i++) {
			if(x[i]!=x[i+1]) {
				
				temp[j] = x[i];
				j++;
			}	
		}
		
		for(int z : temp) {
			if(z!=0) {
			
			System.out.print(z);
			}
		}
		
		
		
	
	}

}
