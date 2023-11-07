package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_Stream_Duplicate {

    public static void main (String[] args){

//        int[] arr = {1,2,2,5,6,6,7,8,8,9};
//        int[] z = Arrays.stream(arr)distinct().toArray();
//
//        int[] arr = {1,3,2,5,2,6,5,8,9,8};
////        Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
//        int[] z = Arrays.stream(arr).sorted().distinct().toArray();
//
//        for(int x:z){
//            System.out.print(x+" ");
//
//        }
//
        String[] s = {"f","a","f","v","a"};
//        List list = Arrays.stream(s).distinct().collect(Collectors.toList());
        Object[] objects = Arrays.stream(s).distinct().toArray();

//        System.out.println(objects);

        for(Object z:objects){
            System.out.println(z);
        }



    }
}
