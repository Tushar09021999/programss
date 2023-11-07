package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 7, 6, 2, 4, 9, 8, 9, 8);
        Set<Integer> newList = list.stream().collect(Collectors.toSet());
        System.out.println(newList);

        List<String> x = Arrays.asList("hi", "hey", "how", "hey", "hello", "hi", "hurry", "hello");

        Set<String> new_List = x.stream().collect(Collectors.toSet());
        System.out.println(new_List);


    }
}