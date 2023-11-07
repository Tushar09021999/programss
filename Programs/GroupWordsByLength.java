package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static void main(String[] args){

        List<String> words = Arrays.asList("i","have","a","sentence","with","technical","words");
        Map<Integer, List<String>> length = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.print(length);

    }
}
