package com.jspPractice.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasalEnergy
 */
@WebServlet("/BasalEnergy")
public class BasalEnergy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasalEnergy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("GET 방식 성공");
		String checkedSex = request.getParameter("sex");
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		int age = Integer.parseInt(request.getParameter("age"));
		
		double basal = 0;
		
		if(checkedSex.equals("male")) {
			basal = 66.47 + (13.75 * weight) + (5*height) - (6.76 * age);
			basal = (int)(Math.floor(basal));
		}else {
			basal = 655.1 + (9.56 * weight) + (1.85*height) - (4.68 * age);
			basal = (int)(Math.floor(basal));
		}
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<!DOCTYPE html>" 
				+ "<html>"
				+"<head>"
				+"<meta charset=\"UTF-8\">"
				+ "<title>기초 대사량 구하기</title>"
				+ "</head>"
				+"<body>"
				+ "<h1>당신의 기초대사량은 </h1>"
				+ "<h1>"+basal +"칼로리입니다." +"</h1>"
				+"</body>"
				+"</html>");
		
		writer.close();
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
