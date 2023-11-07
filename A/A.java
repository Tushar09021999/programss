package A;

import java.util.*;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args){

////        List arr = Arrays.asList("hi","hello","hey","hello","hi","hut","how");
//        List<String> arr1 = new ArrayList(Arrays.asList("hi","hello","hey","hello","hi","hut","how","college","school","sheep","sail"));
//
//        List<String> collect = arr1.stream().filter(z -> z.endsWith("l")).collect(Collectors.toList());
//        System.out.println(collect);
//
//
//
//
//        Set<String> list = new TreeSet(arr1);
//
////        for(String x:arr1){
////            list.add(x);
////
////        }
//        for (String element : list) {
//            System.out.println(element);
//        }

//        Iterator itr = list.iterator();
//
//        if(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        List<String> list1 = new ArrayList<>(Arrays.asList("hi","hey", "hello","ship","duck"));

        List newList = list1.stream().filter(x->x.startsWith("h")).collect(Collectors.toList());
        System.out.println(newList);




    }
}