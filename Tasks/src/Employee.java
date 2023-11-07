import java.time.LocalDate;
import java.util.Date;

public class Employee 
//implements Comparable<Employee>
{
	
	private String name;
	private String address;
	private int dob;
//	private LocalDate  doj;
	private int salary;
	
	
//	@Override
//	public int compareTo(Employee o) {
//		return this.doj.compareTo(o.doj);
//	}
//	
	
	
	
	public Employee(String name, String address, int dob, int salary) {
		this.name=name;
		this.address=address;
		this.dob= dob;
		this.salary=salary;
		}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}




	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
//	public int getDob() {
//		return dob;
//	}
//	public LocalDate  getDoj() {
//		return doj;
//	}




}
