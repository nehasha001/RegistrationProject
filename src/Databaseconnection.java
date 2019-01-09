import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class Databaseconnection extends HttpServlet {

    public static Validate Validate;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String username = request.getParameter("uname");
        String password = request.getParameter("password");


        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "iHateyou7");
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into User (firstname,lastname,gender,email,username,password) values (?,?,?,?,?,?)");


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Login.jsp");
        requestDispatcher.forward(request, response);
    }
}

    










