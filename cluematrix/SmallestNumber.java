package cluematrix;

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr= {10,50,70,60,90,1000};

        int num = Arrays.stream(arr).distinct().skip(4).findFirst().getAsInt();
        System.out.println(num);
    }
}
