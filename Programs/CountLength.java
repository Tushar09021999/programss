package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountLength {
    public static void main(String[] args){

        List<String> list = new ArrayList<>(Arrays.asList("stream","collection","java","root","jam","car") );

        List<String> collect = list.stream().filter(e -> e.length() <= 3).collect(Collectors.toList());
        System.out.println(collect);
        long count = list.stream().filter(e -> e.length() <= 3).count();
        System.out.println(count);
//       List<String> collect1 = list.stream().collect(Collectors.groupingBy(e -> e.length() <= 3)).collect(Collectors.toList());
//        System.out.println(collect1);


    }
}
