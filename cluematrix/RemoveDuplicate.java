package cluematrix;

public class RemoveDuplicate {

    public static void main(String[] args){

        int[] x= {1,2,2,3,3,4,4,5,6,6,7,7,7};
        int[] temp = new int[x.length];
        int j= 0;

        for(int i=0;i<x.length-1;i++){

          if(x[i]!=x[i+1]){

                temp[j] = x[i];
                j++;


            }


        }

        for(int a:temp){
            System.out.print(a+"");
        }





    }}
