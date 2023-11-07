package interview;

public class SecondLargest{



    public int findsecondLargest(int[] a){
        int sl=0;
        int l = a[0];
        for(int i =0; i<=a.length-1;i++){
            if(a[i]>l){
                sl=l;
                l=a[i];
            }
            else if(a[i]<l){
                sl=a[i];
            }
        }
        return sl;

    }


    public static void main(String[] args){

        int[] arr={1,5,3,4,8,9};
        SecondLargest secondLargest = new SecondLargest();
//        System.out.println( secondLargest.findsecondLargest(arr));


        String str = "helllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllo world";


        for(char c ='a'; c<='z';c++){

            int count =0;

            for(int i =0; i<=str.length()-1;i++) {


                if (str.charAt(i)==c) {

                    count++;

                }
            }

            System.out.println(c +" "+ count);





        }


}}