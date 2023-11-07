package cluematrix;

public class PalindromeString {

     public static void main(String[] args){

          String str = "ssaass";
          String newString = "";
          for(int i=str.length()-1;i>=0;i--){
          newString = newString+str.charAt(i);
          }

          if(str.equalsIgnoreCase(newString)){

               System.out.println("Palindrome");
          }
          else {
               System.out.println("Not a Palindrome");
          }

     }
}
