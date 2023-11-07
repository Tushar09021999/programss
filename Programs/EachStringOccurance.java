package Programs;

public class EachStringOccurance {



    public static void main(String[] args) {
        String str= "Hello";
        char find = 'H';
        int count=0;

//        String[] s =str.split(" ");
        for (int i=0; i<str.length();i++){
        {
            if (str.charAt(i) == find) {
                count++;
            }
        }

}
        System.out.println(find +"-->"+count);

    }
}
