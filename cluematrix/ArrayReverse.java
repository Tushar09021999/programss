package cluematrix;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args){

        int[] arr= {1,2,3,4,5,6,7,8,9};

        int[] temp= new int[arr.length];

        int j=0;

        for(int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]);
            temp[j] = arr[i];
            j++;

        }

//        for (int a:temp){
//            System.out.print(a);
//        }
        int[] ints = Arrays.stream(temp).toArray();
        for (int a:ints){
            System.out.print(a);
        }
//        System.out.println(temp);

    }
}
