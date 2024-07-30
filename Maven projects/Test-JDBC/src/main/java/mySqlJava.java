//package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySqlJava {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coforgedata","root","Madhurasql@1620");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from books");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ " "+ rs.getString(2)  );
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {

            con.close();

        }

    }

}