package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/add")
public class Add extends HttpServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) 
						throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");
		
		int num1 = 0;
		int num2 = 0;
		
		if(!num1_.equals("")) {
			num1 = Integer.parseInt(num1_); 
		}
		
		if(!num2_.equals("")) {
			num2 = Integer.parseInt(num2_);
		}
		
		int total = num1 + num2; 
		
		out.printf("Total is %d\n", total);
	}
}
