package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists_Merge {
    public static void main(String[] args){

        List<Integer> list1 = Arrays.asList(1,5,3,4,9,8,10);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);

       List<Integer> mergedList =  Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
       System.out.println(mergedList);

      List<Integer> newList= mergedList.stream().distinct().collect(Collectors.toList());
      System.out.println(newList);
    }
}
