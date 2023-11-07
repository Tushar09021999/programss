package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Employee arun = new Employee("Arun", "K", 100);
		Employee vijay = new Employee("Vijay", "K", 200);
		Employee rahul = new Employee("Rahul", "K", 600);
		
		List <Employee> empDetails = new ArrayList<Employee>();
		empDetails.add(arun);
		empDetails.add(vijay);
		empDetails.add(rahul);
		
//	 for (Employee x : empDetails) {
//		 
//		 System.out.println(x.getFirstName());
//		 System.out.println(x.getLastName());
//		 System.out.println(x.getId());
//		
//	}
//		Second Maximum salary using Stream API
		 Integer salary = empDetails.stream().map(e->e.getId()).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(salary);
	}
	
	

	
}
