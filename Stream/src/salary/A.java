package salary;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A {
	
	public static void main(String[] args) {
		
		Integer[] a= {1,2,4,6,5,8};
		
		Integer result = Arrays.stream(a).distinct().sorted(Comparator.reverseOrder().skip(1).findFirst().get());
		
		
		List<Integer> list = Arrays.asList(1,6,45,6,9,8);
		
		list.stream().sorted(Collections.reverseOrder().Skip(1).findFirst().get());
		
		
	}

}
