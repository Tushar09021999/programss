package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Second_Largest {
    public static void main(String[] args) {

        int[] arr= {1,5,3,4,9};
        Second_Largest secondLargest = new Second_Largest();
        int res = secondLargest.secondLargest(arr);
        System.out.println(res);
//        OptionalInt first = Arrays.stream(arr).skip(1).findFirst();
//        int asInt = first.getAsInt();
//        System.out.println(asInt);

        System.out.println( Arrays.stream(arr).skip(1).findFirst().getAsInt());



        List<String> names = Arrays.asList("Alice","Bob", "Charles","David");
        names.forEach(System.out::print);

    }
    public int secondLargest(int[] a){

        int l=a[0];
        int sl=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>l){
                sl=l;
                l=a[i];
            }
            else if (a[i]>sl){
                sl= a[i];
            }
        }

        return  sl;
    }
}
