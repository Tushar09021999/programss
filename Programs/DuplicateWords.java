package Programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void main(String[] args){

        String str = "hi hello hey hello hi hello how";
        String[] s = str.split(" ");

        HashSet<String> list = new HashSet<>();

        for(String x:s){
        list.add(x);

        }

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        List<String> collect = Arrays.stream(s).sorted().distinct().collect(Collectors.toList());
        Set<String> collect1 = Arrays.stream(s).sorted().collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println(collect1);

        List<String> x = Arrays.asList(str.split(" "));
        Set<String> collect2 = x.stream().collect(Collectors.toSet());
        System.out.println(collect2);


    }
}
