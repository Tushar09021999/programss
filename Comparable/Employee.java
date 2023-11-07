package Comparable;

public class Employee implements Comparable<Employee> {

    private String name;
    private  String dept;
    private int salary;

    public  int compareTo(Employee o){

       return this.salary -o.salary;




    }

    public Employee(String name, String dept, int salary){
        this.name=name;
        this.dept=dept;
        this.salary =salary;


    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;

    }


    public int getSalary(){
        return salary;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + dept + ", Salary: " + salary;
    }



}
