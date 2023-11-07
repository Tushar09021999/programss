package cluematrix;

public class Palindrome {

    public static void main(String[] args){

        int num=525;
        int org = num;
        int n;
        int sum=0;

        while (num > 0) {
            n = num % 10;
            num = num / 10;
            sum = sum * 10 + n;
        }
        if(sum==org){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }




    }
}
