package Programs;

import java.util.Arrays;

public class StringOccurance {

    public static void main(String[] args){

        String str = "hello world";

//       Arrays.stream(s).forEach(System.out::println);


        for(char c='a'; c<='z';c++){

            int count = 0;

           for(int i=0;i<str.length();i++){
               if(str.charAt(i)==c){
                   System.out.println(c+"->"+count);
                   count++;

               }
           }
        }
    }
}
