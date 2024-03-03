package com.icia.servlet1;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example7")
public class ExampleServlet07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		Product product = new Product(name, price);
		
		RequestDispatcher rd = request.getRequestDispatcher("result7.jsp");
		request.setAttribute("result", product);
		rd.forward(request, response);
	}

}
