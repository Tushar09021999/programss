package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){


        ArrayList<Employee> list =new ArrayList();

        list.add(new Employee("tushar", "electrial", 1));
        list.add(new Employee("sarang","cse",2));
        list.add(new Employee("adarsh","mechanical",3));

        list.add(new Employee("lokesh","civil",4));

        Employee employee = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).distinct().skip(0).findFirst().get();
        if(employee!=null){
            System.out.println(employee.getName());
            System.out.println(employee.getDept());
            System.out.println(employee.getSalary());
        }


    }
}