package interview;

public class BubbleSort {

    public static void main(String[] args) {
        int[] x = {1,2,2,5,6,6,7,8,8,9};

        int temp;


        for(int i=0;i<x.length;i++){
            for(int j = 0;j<x.length-1;j++){

                if(x[j]>x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for(int a:x){
            System.out.print(a+" ");
        }
    }
}
