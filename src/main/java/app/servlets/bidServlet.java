package app.servlets;

import app.entities.Bid;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class bidServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/bid.jsp");
        requestDispatcher.forward(req,resp);






    }

}
