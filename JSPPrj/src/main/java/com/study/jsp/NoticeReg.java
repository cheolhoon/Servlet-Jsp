package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")  //reg.html의 action값("notice-reg")과 똑같이 맞춰줌
public class NoticeReg extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
														throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8");
//		requset.setCharacterEncoding("UTF-8");  //한글깨질때 사용하는 필터

		
		/* 다국적문자(한글)를 출력하므로 출력도구 PrintWriter 사용 */
		PrintWriter out = response.getWriter();
		
		/* 
		 * 입력도구(request) 사용 
		 * getParameter를 사용하여 쿼리 키워드를 읽을 수 있음 > 문자로 전달됨!!
		 */
		String title = request.getParameter("title");  //name에서 "title"을 받아옴
		String content = request.getParameter("content");
		
		/* 출력도구(out)를 사용하여 출력 */
		out.println(title + " / ");  
		out.println(content);
		
		/*****  실행은 reg.html에서 한다.!!  *****/
	}

}
