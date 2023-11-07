package program;

public class Second_Largest {
	public static void main(String[] args) {
		int[] arr = {2,6,4,3,5,7,9};
		System.out.println(getSecondLargest(arr));

	}
	
	public static int getSecondLargest(int[] arr) {
		int sl=0;
		int l= arr[0];
		
		for(int i =0; i<arr.length; i++) {
			
			if(arr[i]>l) {
				
				sl=l;
				l=arr[i];
			}
			else if(arr[i]>sl) {
				sl=arr[i];
				
			}
			
			
		}
		
		
		return sl;
		
		
	}

}
