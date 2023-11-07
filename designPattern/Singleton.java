package designPattern;

public class Singleton {

    static Singleton a = null;

    public static Singleton getInstance(){

        if(a==null){
            a= new Singleton();

        }
        return  a;

    }


    public static void main(String args){


        Singleton s1= new Singleton();
        Singleton d2= new Singleton();
        System.out.println(s1);
        System.out.println(d2);


    }

}
