package com.icia.servlet1;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example11")
public class ExampleServlet11 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product("서울우유", 3000);
		RequestDispatcher rd = request.getRequestDispatcher("result11.jsp");
		request.setAttribute("product", product);
		rd.forward(request, response);
	}	
}

