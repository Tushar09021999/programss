package Programs;

import java.util.Optional;

public class Demo {

     int  A =10;

    public static void main(String[] args) {

        Demo demo = null;
        Optional<Demo> test = Optional.ofNullable(demo);
        if(test.isPresent()){
            System.out.println(demo.A);
        }
        else {
            System.out.println("Demo is null");
        }
        System.out.println(100);

    }



}
