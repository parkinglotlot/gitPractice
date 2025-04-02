package com.jspPractice.getpost;

import java.io.IOException;
import java.security.KeyStore.SecretKeyEntry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IdPwd
 */
@WebServlet("/IdPwd")
public class IdPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("post 방식 요청됨.");
		request.setCharacterEncoding("utf-8");
		
//		response.setContentType("text/html; charset=UTF-8");
		
		String pwd =  request.getParameter("pwd");
		
		System.out.println("이름: " + request.getParameter("name"));
		System.out.println("아이디: " + request.getParameter("id"));
		System.out.println("비밀번호: " + request.getParameter("pwd").hashCode());
		System.out.println("생년월일: " + request.getParameter("year") +"년 " +request.getParameter("month") + "월 " + request.getParameter("day") + "일");
	}

}
