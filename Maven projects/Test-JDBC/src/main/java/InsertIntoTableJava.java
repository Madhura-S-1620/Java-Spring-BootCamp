import java.sql.Connection;
import java.sql.DriverManager;
import java .sql.Statement;
import java.sql.SQLException;
public class InsertIntoTableJava {

    static final String dburl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "Madhurasql@1620";
    public static void main(String[]args){

        try(Connection connection= DriverManager.getConnection(dburl,username,password);
            Statement statement=connection.createStatement();){

            String sqlinsert =  "INSERT INTO STUDENT (sid, fname, lname, course) VALUES (1, 'Hardin', 'Scott', 'Python'),(2, 'Naina', 'Shetti', 'Java'))";
            statement.executeUpdate(sqlinsert);
            System.out.println("Values are inserted in the student table" );


        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
            
        }

    }
}
