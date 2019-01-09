import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {

        public static boolean checkUser(String email,String password)
        {
            boolean s =false;
            try{

                //creating connection with the database
                Connection connection = DriverManager.getConnection
                        ("jdbc:postgresql://localhost:5432/","postgres","iHateyou7");

                PreparedStatement ps =connection.prepareStatement
                        ("select * from User where email=? and password =?");

                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                s = rs.next();

            }catch(Exception e)
            {
                e.printStackTrace();
            }
            return s;
        }
    }



