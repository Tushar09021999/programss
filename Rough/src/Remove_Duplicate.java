
public class Remove_Duplicate {
	public static void main(String[] args) {
		

	int[] a = {1,1,2,4,5,5,6,7,8,8};
	int[] temp = new int[a.length];
	
	int j=0;
	
	
	for(int i = 0; i<a.length-1; i++) {
		
		if(a[i]!=a[i+1]) {
			
			temp[j] = a[i];
			j++;
		}
		
		
		
		
		
		
		
	}for(int x:temp) {
			if(x!=0)
			System.out.println(x);
		}
	                                
	                                
	                               
}
}
