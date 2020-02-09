package Controller;

import Entity.User_ID_PW;
import Service.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")

public class Login_Servlet extends HttpServlet {

    private Login userLogin = new Service.ClassImpl.Login();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userIDstr = req.getParameter("userID");
        String passWord = req.getParameter("passWord");

        int userID = Integer.parseInt(userIDstr);

        Object user = userLogin.login(userID,passWord);

        if(user != null)
        {
            HttpSession session = req.getSession();
            session.setAttribute("User",user);
            req.getRequestDispatcher("WebPage/AfterLogin.jsp").forward(req,resp);
        }
        else
        {
            resp.sendRedirect("WebPage/RFID_Login.jsp");
        }

    }

}
