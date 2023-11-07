package interview;

public class StringOccurance {
    public static void main(String[] args) {
        String str = "i am a java developer";


        for(char c ='a'; c<='z';c++){
            int count =0;
            for(int i =0;i<str.length();i++){

                if(str.charAt(i)==c){
                    count++;
                }
            }

            if(count!=0) {
                System.out.println(c + ": " + count);
            }

        }



    }
}
