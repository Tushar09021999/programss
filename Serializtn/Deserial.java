package Serializtn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {


        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Serialization\\ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student =(Student)ois.readObject();
            student.diaplayName();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());



        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}