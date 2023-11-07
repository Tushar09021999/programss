package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(45,"tushar", 4500));
		emp.add(new Employee(25,"sarang",1100));
		emp.add(new Employee(2, "vijay", 8000));
		emp.add(new Employee(66,"adarsh", 3650));
		
		System.out.println("                          Id");
		IdCompare empid = new IdCompare();
		Collections.sort(emp, empid);
		
		for (Employee x : emp) {
			 System.out.println(x.getId());
			 System.out.println(x.getName());
			 System.out.println(x.getSalary());
			
		}
		
		System.out.println();
		
		
		System.out.println("                           Salary");
		SalaryCompare empSal = new SalaryCompare();
		Collections.sort(emp,empSal);
		
		for (Employee x : emp) {
			 System.out.println(x.getId());
			 System.out.println(x.getName());
			 System.out.println(x.getSalary());
			
		}
	}
	
	
}
