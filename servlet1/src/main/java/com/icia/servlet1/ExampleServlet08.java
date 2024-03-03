package com.icia.servlet1;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example8")
public class ExampleServlet08 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("example8.jsp");
		rd.forward(request, response);
	}	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		Product product = new Product(name, price);
		
		RequestDispatcher rd = request.getRequestDispatcher("result8.jsp");
		request.setAttribute("result", product);
		rd.forward(request, response);
	}

}

