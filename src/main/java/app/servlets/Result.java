package app.servlets;

import app.entities.Search;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Result extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();

        List<String> names1 = model.list();
        Search search = new Search(req.getParameter("model1"));


        req.setAttribute("carNames1", names1);
        req.setAttribute("carNames2", search);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/resultSearch.jsp");
        requestDispatcher.forward(req, resp);
    }
}
