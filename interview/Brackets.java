package interview;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args){

        System.out.println("Enter elements");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count1=0;
        int count2=0;

       for(int i=0;i<=str.length()-1;i++){

           if(str.charAt(i)==('(')){
               count1++;


           }
           else if(str.charAt(i)==(')')){
               count2++;
           }

       }

       if(count1==count2){
           System.out.println("Brackets are equal");
       }
       else {
           System.out.println("Not equal");
       }





    }
}
