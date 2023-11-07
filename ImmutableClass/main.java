package ImmutableClass;

public class main {
    public static void main(String[] args) {

        A a = new A("tushar", 24);
        System.out.println(a.getName());
        System.out.print(a.getAge());

        A a2 = new A("adarsh", 25);

        System.out.println(a2.getName());
        System.out.println(a2.getAge());


    }

}
