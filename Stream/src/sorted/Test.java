package sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Demo> emp = new ArrayList<Demo>();
		emp.add(new Demo(18,"tushar", 2000));
		 emp.add(new Demo(2, "sarang", 3000));
		 emp.add(new Demo(43,"vijay", 4500));
		 emp.add(new Demo(25,"adrash", 5600));
		 
		 System.out.println( emp.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
	}

}
