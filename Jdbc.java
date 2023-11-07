import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc", "root", "test");
            System.out.println(con);

            Statement stmnt = con.createStatement();
            stmnt.executeUpdate("insert into student values('name', 'email','7038669549')");
            stmnt.executeUpdate("delete from student where email = email");
            con.close();

        }
        catch(Exception e){


        }
    }

}
