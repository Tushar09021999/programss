package interview;

public class ObjectClone implements Cloneable{

    public static void main(String[] args){

        ObjectClone a1 = new ObjectClone();
        try {
            ObjectClone a2 = (ObjectClone) a1.clone();
            System.out.println(a1.hashCode());
            System.out.println(a2.hashCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
