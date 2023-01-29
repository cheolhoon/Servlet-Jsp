package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/add2")
public class Add2 extends HttpServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) 
						throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String[] num_ = request.getParameterValues("num");
		
		int result = 0;
		
		for (int i=0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result += num;
		}
		
		out.printf("Total is %d\n", result);
	}
}
