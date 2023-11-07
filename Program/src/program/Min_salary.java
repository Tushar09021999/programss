package program;

public class Min_salary {
public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,7,6};
		
		int minSal = arr[0];
		
		for(int i =0; i<arr.length-1; i++)
		{
			if(minSal>arr[i]) {
				
			minSal=arr[i];
				
			}
			
		}
		System.out.println(minSal);
		
	}
}
