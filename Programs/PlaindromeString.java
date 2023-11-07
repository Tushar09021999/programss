package Programs;

import java.util.Scanner;

public class PlaindromeString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value");
        String str = sc.nextLine();

        String temp = str;
         String newStr= "";

        for(int i = str.length()-1;i>=0;i--){

            newStr = newStr+str.charAt(i);
        }

//        System.out.println(newStr);

        if(str.equalsIgnoreCase(newStr)){

            System.out.println("Panlindrome");
        }

        else {
            System.out.println("Not a Palindrome");
        }


    }
}
