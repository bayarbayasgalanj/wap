package web;

import model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class BeerSelect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the beer color parameter from the form
        String color = request.getParameter("color");

        // Use BeerExpert model to get recommendations
        BeerExpert beerExpert = new BeerExpert();
        List<String> recommendations = beerExpert.getBrands(color);

        // Add recommendations to the request object
        request.setAttribute("styles", recommendations);

        // Forward the request to the JSP
        RequestDispatcher view = request.getRequestDispatcher("pages/result.jsp");
        view.forward(request, response);
    }
}
