package com.icia.servlet1;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.*;

@WebServlet("/example6")
public class ExampleServlet06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product p = new Product(name, price);
		PrintWriter out = response.getWriter();
		
		out.println(new ObjectMapper().writeValueAsString(p));
		out.flush();
	}
}
