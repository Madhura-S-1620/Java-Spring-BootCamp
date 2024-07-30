package GlobalTours.Auth;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import GlobalTours.Models.User;
import GlobalTours.Util.DBConn;

public class Login {

    static Connection con
            = DBConn.getConnection();

    public boolean authenticate(String emailId,String password) throws SQLException{
        String query = "SELECT * FROM User WHERE emailId = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, emailId);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        return rs.next();

    }


    public User getUserDetails(String emailId) throws SQLException {
        Connection conn = DBConn.getConnection();
        String query = "SELECT name, emailId FROM user WHERE emailId = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, emailId);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            User user = new User();
            user.set_name(rs.getString("name"));
            user.set_emailId(rs.getString("emailId"));
            return user;
        }
        return null;
    }
}
