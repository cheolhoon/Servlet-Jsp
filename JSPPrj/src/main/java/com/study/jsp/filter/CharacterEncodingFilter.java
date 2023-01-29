package com.study.jsp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request
			, ServletResponse response
			, FilterChain chain)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");  //요청이 오면 실행(필터 전에 실행)
		
		/* 
		 * request - 요청이 오면 흐름을 넘겨서 다음 필터(서블릿) 실행
		 * response - 그 후 결과가 돌아오면 아래가 실행
		 */
		chain.doFilter(request, response);
		
//		System.out.println("After Filter");  //필터 후에 실행

	}

}
