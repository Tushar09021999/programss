package Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

    public static void main(String[] args){



        List<Student> list = new ArrayList<>();
        list.add(new Student("tushar", 24,35000));
        list.add(new Student("adarsh", 18,64585));
        list.add(new Student("viraj",27,634598));
        list.add(new Student("lokesh",66,5447687));

//        Student student = new Student();


        List<Student> sortedList = list.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());

        for(Student z: sortedList){
            System.out.println(z.getName());
            System.out.println(z.getAge());
            System.out.println(z.getSalary());

        }

//        for (Student x : sortedList) System.out.println(x.getName() + " " + x.getAge() + " " + x.getSalary());
//        sortedList.forEach(s -> System.out.println(s.getName() + " " + s.getAge() + " " + s.getSalary()));


    }
}
