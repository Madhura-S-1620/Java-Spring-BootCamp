import java.sql.Connection;
import java.sql.DriverManager;
import java .sql.Statement;
import java.sql.SQLException;
public class UpdateValuesFromTable {

    static final String dburl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "Madhurasql@1620";
    public static void main(String[]args){

        try(Connection connection= DriverManager.getConnection(dburl,username,password);
            Statement statement=connection.createStatement();){

            String sqlupdate =  "UPDATE STUDENT SET lname='Khan' WHERE sid=1";
            statement.executeUpdate(sqlupdate);
            System.out.println("One row updated from student table" );


        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);

        }

    }
}