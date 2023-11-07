package Serializtn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serial {

    public static void main(String[] args) {

        try {

            Student student = new Student("Tushar Mule", "muletushar6@gmail.com", 24, "Nagpur");

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Serialization\\ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("object is Serialzed");

        }
        catch (IOException e){
            e.printStackTrace();

        }
    }


}