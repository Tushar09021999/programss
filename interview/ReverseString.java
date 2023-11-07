package interview;

public class ReverseString {

    public static void main(String[] args)
    {
        String str = "Hello world";
        String s ="";

        for(int i = str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));

        s= s+str.charAt(i);
    }

        System.out.println(s);
    }
}
