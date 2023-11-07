package cluematrix;

public class Singleton {

    static Singleton singleton= null;

    private Singleton(){

    }

    static Singleton getOneInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
