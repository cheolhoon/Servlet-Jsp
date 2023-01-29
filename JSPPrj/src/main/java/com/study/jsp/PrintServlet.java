package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response) 
														throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String temp = requset.getParameter("cnt"); 
		int cnt = 10;
		
		if (temp != null && !temp.equals(""))
			cnt = Integer.parseInt(temp);
		
		for (int i =0; i<cnt; i++) {
			out.println((i+1)+ ": 안녕 Servlet!!<br />");	
		}
	}

}
