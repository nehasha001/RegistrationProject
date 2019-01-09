package Package;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
