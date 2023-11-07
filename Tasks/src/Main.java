import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		
		
//		private String name;
//		private String address;
//		private int dob;
//		private int doj;
		
	
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
//		emp.add(new Employee("tushar","nagpur",2,"2020/12/06" ));
//		emp.add(new Employee("sarang","delhi",1,"2014/11/07"));
		emp.add(new Employee("adarsh","mumbai",2, 10000));
		emp.add(new Employee("vijay","chennai",4,78000));
		emp.add(new Employee("suraj","bangalore",5,200));
		
		
//		Collections.sort(emp);
////		Collections.reverseOrder();
//		
//		
//		for (Employee x : emp) {
//			System.out.println(x.getName());
//			System.out.println(x.getAddress());
//			System.out.println(x.getDob());
//			System.out.println(x.getDoj());
//			System.out.println();
//			
		
		
		System.out.println( emp.stream().sorted().skip(1).findFirst().get());
		}
		
	}
	
	

