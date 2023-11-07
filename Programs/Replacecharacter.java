package Programs;

public class Replacecharacter {
    public static void main(String[] args){


        String str = "eelcome to java";
        String[] s = str.split("");

        s[0] = "w";

        for (String a:s){
            System.out.print(a);
        }







    }
}
