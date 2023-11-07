package practice;

public class Min_num {
	
	public static void main(String[] args) {
		
		int[] a = new int[] {2,4,6,8,3,4,5};
		
		int min=a[0];
		for(int i =0; i<a.length; i++) {
			
			if(min>a[i]) {
				min=a[i];
			
			}
			
			
		}
		
		System.out.println(min);
	}
	
	

}
