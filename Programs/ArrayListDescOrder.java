package Programs;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDescOrder {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("AA","ZZ","CC","FF"));

//     Collections.sort(list,Collections.reverseOrder());
////        System.out.println(list);
        List<String> collect = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
