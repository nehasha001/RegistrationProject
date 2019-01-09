import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* String firstname = request.getParameter("First Name");
        String lastname= request.getParameter("Last Name");
        String gender= request.getParameter("Gender");
        String email= request.getParameter("Email");*/
        String uname= request.getParameter("username");
        String password= request.getParameter("password");
        if (uname.equals("Neha")&& password.equals("javabatch"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("/Welcome.jsp");
        }
        else{
            response.sendRedirect("Register.jsp");
        }
    }
}
