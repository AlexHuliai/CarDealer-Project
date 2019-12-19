package app.servlets;

import app.entities.Transaction;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Transaction tr = new Transaction();
        tr.setFirstName(req.getParameter("firstName"));
        tr.setLastName(req.getParameter("lastName"));
        tr.setPricePaid(req.getParameter("pricePaid"));
        tr.setDatePurchased(req.getParameter("datePurchased"));
        tr.setVin(req.getParameter("vin"));

        ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

        transactionList.add(tr);
        for(int i=0;i<transactionList.size();i++
             ) {
            tr.saveToFile();
        }






        RequestDispatcher rs = req.getRequestDispatcher("views/Transaction.jsp");
        rs.forward(req, resp);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req , resp);
    }
}
