package Programs;

final public class Immutable {

    private final String name;
    private final String email;

     Immutable(String name, String email){
        this.name= name;
        this.email=email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
