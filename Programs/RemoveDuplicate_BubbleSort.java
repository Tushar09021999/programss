package Programs;

public class RemoveDuplicate_BubbleSort {

    public static void main(String[] args){

        int[] x = {1,5,7,6,5,7,9,4,2,1,9,3};
        int temp;


        for(int i = 0;i<x.length;i++){
            for(int j=0;j<x.length-1;j++){
                if(x[j]>x[j+1]){
                    temp=x[j];
                    x[j]= x[j+1];
                    x[j+1] = temp;
                }
            }


        }

       for(int a:x){
            System.out.print(a+ " ");
     }
        System.out.println();


        int[] sortArr = new int[x.length];
        int j = 0;
        for(int i=0;i<x.length-1;i++){
            if(x[i]!=x[i+1]){
                sortArr[j] = x[i];
//
                j++;
            }
        }


        for(int z:sortArr){
            System.out.print(z+" ");
        }



    }









































////
////    public static void main(String[] args) {
//        int[]  x= {1,5,3,45,2,6,4,45,6,3,2};
//
//
////        int[] x= {1,2,5,7,6,3,4,9};
//        int temp;
//        for(int i=0;i<x.length;i++){
//            for(int j =0;j< x.length-1;j++){
//                if(x[j]>x[j+1]){
//
//                    temp = x[j];
//                    x[j] = x[j+1];
//                    x[j+1] = temp;
//                }
//
//            }
//        }
////
//        for(int a:x){
//            System.out.println(a);
//        }
//
//
////        int[]  x= {1,2,2,3,3,4,5,5,6,6,6,7};
//        int[] temp1 = new int [x.length];
//        int j= 0;
//
//        for(int i=0; i<x.length; i++){
//            if(i == x.length-1 || x[i]!=x[i+1]){
//                temp1[j] = x[i];
//                j++;
//            }
//        }
//
//        for(int a:temp1){
//            if(a!=0)
//            System.out.println(a);
//        }
//
//
//
//
//    }
}
