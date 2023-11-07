package cluematrix;

public class ArraySort{
    public static void main(String[] args){

        int[] x ={1,5,3,4,9,7,6};
        int temp;

        for(int i=0;i<x.length;i++){
            for(int j= 0;j<x.length-1;j++){
                if(x[j]>x[j+1]){
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;



                }


            }        }

        for (int a:x){
            System.out.print(a+",");
        }
    }
        }
