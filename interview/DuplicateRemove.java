package interview;

public class DuplicateRemove {

    public static void main(String[] args) {



    int[] arr = {1,2,2,5,6,6,7,8,8,9};

    int[] temp = new int[arr.length];
    int j=0;


    for(int i =0; i<arr.length-1;i++){

        if(arr[i]!=arr[i+1]){

            temp[j] = arr[i];
            arr[i]= arr[i+1];
            j++;
        }

    }

    for(int x:temp){
        System.out.print(x+" ");
    }

}
    }
