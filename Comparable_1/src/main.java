import java.util.ArrayList;
import java.util.Collections;

public class main {

	 public static void main(String[] args) {
		 
		 ArrayList<Employee> emp = new ArrayList<Employee>();
		 emp.add(new Employee(18,"tushar", 2000));
		 emp.add(new Employee(2, "sarang", 3000));
		 emp.add(new Employee(43,"vijay", 4500));
		 emp.add(new Employee(25,"adrash", 5600));
		 
		 Collections.sort(emp);
		 
		 for (Employee x : emp) {
			 System.out.println(x.getId());
			 System.out.println(x.getName());
			 System.out.println(x.getSalary());
			
		}
		 
		 
	}

	
}
