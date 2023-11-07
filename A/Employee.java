package A;

public class Employee implements Comparable<Employee>{

    private String name;
    private String dept;
    private  int salary;

    public Employee(String name, String dept, int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;

    }

    @Override
    public int compareTo(Employee o) {
        return this.salary-o.salary ;
    }
//    public String setName(String name){
//
//        return  this.name=name;
//    }
//
//    public String setDept(String dept){
//
//        return this.dept=dept;
//
//    }
//
//    public int setSalary(int salary){
//        return this.salary =salary;
//
//    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }
    public int getSalary(){
        return salary;

    }



}