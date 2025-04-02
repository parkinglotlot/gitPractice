package com.jspPractice.getpost;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionLogin.do")
public class SessionLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SessionLogin() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("POST 전송 완료");
		
		//정보 얻어오기
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userBirth = request.getParameter("userBirth");
//		System.out.println(userBirth);

		HttpSession hss = request.getSession();
		hss.setAttribute("userId", userId);
		hss.setAttribute("userPwd", userPwd);
		hss.setAttribute("userBirth", userBirth);
		
		
		//로직(아이디/비번/생년월일)
//		if(userId.contains) {
//			
//		}
		
	}

}
