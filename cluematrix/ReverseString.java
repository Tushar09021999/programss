package cluematrix;

public class ReverseString {
    public static void main(String[] args) {

        String str = "hello world";

        String newStr = "";

        for(int i= str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.print(newStr);

    }

}
