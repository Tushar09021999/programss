package practice;

public class DuplicatePrint_Index {

	public static void main(String[] args) {
		
	     int [] arr =   {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	     int index = 0;
	     int count =0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.println("duplicate array element");
				System.out.println(arr[j]);
				index = j;
				count++;
				
				System.out.println("index:" + j);
				
			}
				
			
			
			
		}
		
	}System.out.println(count);
}}

