import java.sql.Connection;
import java.sql.DriverManager;
import java .sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
public class UserInput {

    static final String dburl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "Madhurasql@1620";
    public static void main(String[]args){



        try(Connection connection= DriverManager.getConnection(dburl,username,password);
            Statement statement=connection.createStatement();){

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the id:");
            int sid=scanner.nextInt();
            System.out.println("Enter the fname:");
            String fname=scanner.next();
            System.out.println("Enter the lname:");
            String lname=scanner.next();
            System.out.println("Enter the course:");
            String course=scanner.next();

            String sqlinsert1 =  String.format("INSERT INTO STUDENT (sid, fname, lname, course) " +
                    "VALUES (%d, '%s', '%s', '%s')", sid, fname, lname, course);
            statement.executeUpdate(sqlinsert1);
            System.out.println("Value inserted into student table successfully..." );


        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);

        }

    }
}