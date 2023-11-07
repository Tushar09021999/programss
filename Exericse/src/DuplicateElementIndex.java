
public class DuplicateElementIndex {
	
	public static void main(String[] args) {
		
		int[] arr= {1,0,2,4,5,5,8,6,7,7};
		int index= 0;
		
		System.out.println("Duplicate  |  index");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
			
			if(arr[i]==arr[j]) {
				
				index = j;
				
				System.out.println(arr[j]+"               "+ index);	
			}
			}
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
