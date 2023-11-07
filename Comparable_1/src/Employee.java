
public class Employee implements Comparable<Employee>{

 private int id;
 private String name;
 private int salary;
 
 
 @Override
 public int compareTo(Employee o) {
 	 return this.id - o.id;

 }
  
 
 public Employee( int id, String name, int salary)
 {
	 this.id = id;
	 this.name= name;
	 this.salary = salary;
	 
 }

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}


 




	
}
