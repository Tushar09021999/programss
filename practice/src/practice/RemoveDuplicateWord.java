package practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		
		String string ="This sentence contains two words one and two two two one words";
		String[] x = string.split(" ");
		 Set<String> list = new LinkedHashSet<String>();
		 
		 
		 
		 
		 for(String a:x) {
			list.add(a);
		 }
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				
				System.out.print(itr.next()+" ");
			
			
			 
		 }
		 
		 
	}
	}
	


