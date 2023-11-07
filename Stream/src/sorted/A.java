package sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,3,7,4,9);
		
		List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
				System.out.println(newList);
	}
}
