package Programs;

public class D implements Cloneable{

    public void show(){
        System.out.println("This is a show method");

    }


    public static  void main(String[] args){

        D d1 = new D();
        try {
            D d2 = (D) d1.clone();
            d2.show();
        }
        catch (Exception e){

            e.printStackTrace();
        }




    }
}
