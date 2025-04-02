package com.jspPractice.getpost;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dday")
public class Dday extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dday() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("GET방식 전송 완료");

		// 현재 날짜 - 디데이
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String pp = dateFormat.format(new Date());
		
		Calendar present = Calendar.getInstance();
		present.setTime(new Date()); //현재 날짜
		
		
		
		// 디데이
		String ddate = request.getParameter("dday");
//		System.out.println(ddate); //yyyy-mm-dd
		Date dday = null;
		try {
			dday = new SimpleDateFormat("yyyy-MM-dd").parse(ddate);
		} catch (ParseException e) {
			System.out.println("제대로 입력되지 않았습니다.");
		}

		Calendar dDate = Calendar.getInstance();
		dDate.setTime(dday); //디데이 
		
//		System.out.println(pp +"," +ddate);
//		System.out.println(present +"," +dDate);
		
		long diffTime = (dDate.getTimeInMillis() - present.getTimeInMillis())/1000; //초 단위
		long remainderDay = diffTime/(60*60*24); //일자수
		
		request.setAttribute("pp", pp);
		request.setAttribute("ddate", ddate);
		request.setAttribute("remainderDay", remainderDay);
		
		String ddayTalk = null;
		if(remainderDay < 0) {
			ddayTalk = "디데이로부터 " + (-remainderDay) + "일 지났습니다.";
		}else if(remainderDay == 0) {
			ddayTalk ="디데이입니다.";
		}else {
			ddayTalk ="디데이까지 " + remainderDay + "일 남았습니다.";
		}
		
		request.setAttribute("ddayTalk", ddayTalk);
		
		RequestDispatcher rd = request.getRequestDispatcher("ddayOut.jsp");
		rd.forward(request, response);

	}

}
