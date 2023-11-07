package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareNo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream","and","for","is","and","and");
		
		List<String> newList = names.stream().filter(x->x.startsWith("and")).collect(Collectors.toList());
	
		System.out.println("and:" + newList.size());
		
		
//		List<String> list = names.stream().filter(x->x.endsWith("n")).collect(Collectors.toList());
//		
//		System.out.println(list);
//
//		System.out.println(list.size());
}
}
