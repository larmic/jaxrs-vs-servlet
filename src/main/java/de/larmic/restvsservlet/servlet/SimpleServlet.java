package de.larmic.restvsservlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simpleServlet")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("simple servlet GET called");
        final PrintWriter writer = response.getWriter();
        writer.write("simple servlet GET called");
    }

    // curl -X PUT --data "name=batman" http://localhost:8080/restvsservlet/simpleServlet
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("simple servlet PUT called");
        final PrintWriter writer = response.getWriter();
        writer.write("simple servlet PUT called");
    }
}
