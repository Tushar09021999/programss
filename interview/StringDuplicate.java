package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringDuplicate {
    public static void main(String[] args) {


    String[]  str= {"hi", "hello", "hey","hi","hello","ho","ho"};

    HashSet s = new HashSet();

    for(String x:str){
        s.add(x);
    }

    Iterator itr = s.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }


        List<String> collect = Arrays.stream(str).distinct().collect(Collectors.toList());
        System.out.println(collect);

    }

}
