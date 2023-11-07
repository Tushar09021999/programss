package Comparable;

import java.util.*;

public class Main {

    public static void main(String[] args){

        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee("tushar","electrical",40));
        emp.add(new Employee("sarang","cse",30));
        emp.add(new Employee("adarsh","EE",20));
        emp.add(new Employee("lokesh","civil",10));


        Collections.sort(emp);
//
//        for(Employee e:emp){
//            System.out.println(e.getName());
//            System.out.println(e.getDept());
//            System.out.println(e.getSalary());
//        }
//        Optional<Integer> first = emp.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
//        System.out.println((first.get()));


        emp.stream().forEach(e->System.out.println(e));

//        emp.stream().forEach(System.out::println);

//        Employee employee = emp.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary()).findFirst().get();
//        System.out.println(employee.getSalary());
//        System.out.println(employee.getDept());
//        System.out.println(employee.getName());

//        Employee e =emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();



    }



















}
