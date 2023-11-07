package program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Array {

	public static void main(String[] args) {
		
	int[] arr= {1,5,46,5,12,4,4,5,9,46};
//	int[] temp = new int[arr.length];
//	
//	
//	int j =0;
//	
//	for(int i =0; i<arr.length-1; i++) {
//		
//		if(arr[i]!=arr[i+1]) {
//			
//			temp[j] =arr[i];
//			j++;
//		}
//		}
//		
//		for(int x:temp) {
//			if(x!=0)
//			System.out.print(x);
//		}
		
		Set<Integer> list = new LinkedHashSet<Integer>();
		
		
		for(int a:arr) {
			list.add(a);
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
