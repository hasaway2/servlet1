package com.icia.servlet1;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example4")
public class ExampleServlet04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nai = Integer.parseInt(request.getParameter("nai"));
		int money = 0;
		if(nai>=25 && nai<=64) {
			money = 3500;
		}
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String html = "<html><body><p>합계 <span style='color:blue;'>입장료 : " + money + "</span></p></body></html>";
		out.print(html);
		out.flush();
	}
}
