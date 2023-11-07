package interview;

public class PalindromeNumber {
    public static void main(String[] args){

        int num = 525;
        int temp = num;
        int n, sum=0;


        while(num>0){

            n = num%10;
            sum = sum*10 +n;
            num = num/10;


        }

        if(temp == sum){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }


    }
}
