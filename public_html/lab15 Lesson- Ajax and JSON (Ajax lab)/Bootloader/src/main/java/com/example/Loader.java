package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

@WebServlet("/loader")
public class Loader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<String> list = new ArrayList<>();
        list.add("images/abilene.gif");
        list.add("images/steve-madden.jpg");
        list.add("images/go-go.gif");
        list.add("images/thomas-wylde.jpg");
        list.add("images/wolverine.jpg");
        list.add("images/frye.jpg");
        list.add("images/ugg.jpg");
        list.add("images/abilene.gif");
        list.add("images/frye.jpg");
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        String randomElement = list.get(randomIndex);

        PrintWriter out = response.getWriter();
        out.println(randomElement);
    }
}
