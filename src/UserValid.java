import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserValid extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,
                IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("Neha") && password.equals("javabatch")) {
                System.out.println("Successfully Logged in");
            } else {
                System.out.println("Unsuccessful");
            }

        }}
