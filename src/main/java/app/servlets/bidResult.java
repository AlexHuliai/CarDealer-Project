package app.servlets;

import app.entities.Bid;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class bidResult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {

        Bid bid = new Bid(req.getParameter("bid"),req.getParameter("vin"));
        ArrayList<Bid> bids = new ArrayList<Bid>();
        bids.add(bid);
        for(int i = 0 ; i<bids.size();i++) {
            bid.saveToFile();
        }



        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/bidResult.jsp");
        requestDispatcher.forward(req, resp);

    }
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        doPost(req , resp);
    }

}
