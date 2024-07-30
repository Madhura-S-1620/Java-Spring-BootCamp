import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    static final String dburl="jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "Madhurasql@1620";
    public static void main(String[] args) {
        try(Connection connection= DriverManager.getConnection(dburl,username,password);
            Statement statement=connection.createStatement();)
        {
            String sqlcreate= "CREATE TABLE STUDENT" +
                    "(sid INTEGER not null," +
                    "fname VARCHAR(50) ," +
                    "lname VARCHAR(50), "+
                    "course VARCHAR(50),"+
                    "PRIMARY KEY(sid))";
            statement.executeUpdate(sqlcreate);
            System.out.println("Student table created in database coforgedata.." );

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
