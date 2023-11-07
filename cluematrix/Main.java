package cluematrix;

public class Main {
    public static void main(String[] args) {

        Singleton a =  Singleton.getOneInstance();
        Singleton b =  Singleton.getOneInstance();
        System.out.println(b);
        System.out.println(a);

    }
}
