package program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Remove_Duplicate_String {
	
	
	public static void main(String[] args) {
		
	
	
	String str = " hi hello here hello here hi hey hello hey";
	
	String[] s = str.split(" ");
	
	Set<String> list = new LinkedHashSet<String>();
	
       for(String a:s) {
    	   
    	   list.add(a);
       }
       
       Iterator itr = list.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
		
	}

}

