package Controller;

import Service.ClassImpl.SignUp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SignUp")
public class SignUp_Servlet extends HttpServlet {

    private SignUp signUp = new SignUp();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String userID = req.getParameter("userID");
        String passWord = req.getParameter("passWord");
        String EPC_code = req.getParameter("EPC_code");

        int ID = Integer.parseInt(userID);
        int epc = Integer.parseInt(EPC_code);

        signUp.Signup(ID, passWord, epc);

        resp.sendRedirect("WebPage/AfterSignUp.html");

    }
}
