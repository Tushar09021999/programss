package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> list =new ArrayList<>();
        list.add(new Employee("tushar",350000,24));
        list.add(new Employee("sarang",56400,65));
        list.add(new Employee("adarsh",99945,12));
        list.add(new Employee("suraj",78451,17));
        list.add(new Employee("lokesh",10000,22));

//        List<Employee> newSalary = list.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
//        List<Employee> newSalary = list.stream()
//                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
//                .limit(3)
//                .collect(Collectors.toList());
//
//        newSalary.forEach(System.out::println);
//        List<Employee> newList = list.stream().filter(e -> e.getAge() >= 18).peek(x-> System.out.println(x.getAge())).collect(Collectors.toList());
        List<Employee> newList = list.stream().filter(e -> e.getAge() >= 18).limit(3).collect(Collectors.toList());
//        String s = newList.toString();

        for (Employee x: newList) {
            System.out.println(x.getName());
            System.out.println(x.getSalary());
            System.out.println(x.getAge());

        }

    }
}
