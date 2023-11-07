package interview;

public class ArraySortRemoveDuplicate {
    public static void main(String[] args) {

        int[]  x = {1,5,3,4,3,4,9,6,9,7,3,7};

        int temp;


        for(int i=0;i<x.length;i++){

            for(int j=0; j<x.length-1;j++){

                if(x[j]>x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }


        int[] sortArr = new int[x.length];

        int j=0;

        for(int i =0;i<x.length-1;i++) {

            if (x[i] != x[i + 1]) {


                sortArr[j] = x[i];
                j++;

            }
        }



        for(int z: sortArr){
            System.out.print(z+ " ");
        }


    }
}
