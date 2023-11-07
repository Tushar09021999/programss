package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_Sorting {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		list.add(45);
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(75);
		list.add(75);
		list.add(9);
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(9);

//		List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
//		List<Integer> List = list.stream().filter(e->e>15).collect(Collectors.toList());

		
		Set<Integer> arr = list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toSet());
		
//		System.out.println(newList);
//
//		System.out.println(List);
		
		System.out.println(arr);
		

//		HashSet<Integer> arr = new HashSet();
//		
//		for(int i =0; i<list.size(); i++) {
//			
//			arr.add(list.get(i));
//			
//			
//		}
//		System.out.println(arr);
		
		
		
	}
	
	
	
	
	
 

}
