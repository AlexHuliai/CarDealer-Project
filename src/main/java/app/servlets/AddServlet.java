package app.servlets;

import app.entities.Car;
import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String make = req.getParameter("make");
        String model1 = req.getParameter("model1");
        String year = req.getParameter("year");
        String engine = req.getParameter("engine");
        String transmision = req.getParameter("transmision");
        String color = req.getParameter("color");
        String vin = req.getParameter("vin");
        String miles = req.getParameter("miles");
        String dateSubmited = req.getParameter("dateSubmited");
        String price = req.getParameter("price");
        String image = req.getParameter("image");




        Car car = new Car(make,model1,year, engine, transmision, color, vin,miles, dateSubmited, price,image);
        car.saveToFile();
        Model model = Model.getInstance();
        model.add(car);
        List<String> names = model.list();

        req.setAttribute("carNames", names);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);



    }
}

