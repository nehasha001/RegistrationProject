import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Logservlet {

    public class LogServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (Databaseconnection.Validate.checkUser(email, password)) {

                RequestDispatcher requestDispatcher = request.getRequestDispatcher("Welcome.jsp");
                requestDispatcher.forward(request, response);
            } else {
                System.out.println("Username or Password incorrect");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
                requestDispatcher.include(request, response);
            }
        }
    }






}
