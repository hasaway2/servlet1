package com.icia.servlet1;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example13")
public class ExampleServlet13 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Board> list = new ArrayList<>();
		for(int i=10; i>0; i--) {
			list.add(new Board(i, i+"번째 글", "spring", "2024-03-04", 1));
		}
		RequestDispatcher rd = request.getRequestDispatcher("result13.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}	
}

