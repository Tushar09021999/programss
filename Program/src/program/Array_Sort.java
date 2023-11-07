package program;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Array_Sort {

		public static void main(String[] args) {
			int[] arr = {10,1,6,4,8,5,2,2,9,4,10,9};
			
			Set<Integer> list = new TreeSet<Integer>();
			
			for(int a:arr) {
				list.add(a);
			}
			
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				
				System.out.print(itr.next()+",");
			}
			
			
		}
}
