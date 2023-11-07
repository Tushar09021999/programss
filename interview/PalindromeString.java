package interview;

public class PalindromeString {

    public static void main(String[] args){

        String str = "maam";

        String newStr = "";


        for(int i= str.length()-1;i>=0;i--){

            newStr = newStr + str.charAt(i);

        }


        if(str.equalsIgnoreCase(newStr)){

            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }





    }
}
