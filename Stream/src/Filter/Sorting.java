package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(99);
		list.add(23);
		list.add(59);
		list.add(12);
		list.add(2);
		list.add(23);
		list.add(9);
		list.add(1);
		
		List<Integer> newList = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(newList);

		
		
		
		
		
	}

}
