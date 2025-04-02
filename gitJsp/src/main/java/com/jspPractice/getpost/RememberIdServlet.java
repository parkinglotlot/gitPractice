package com.jspPractice.getpost;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RememberIdServlet")
public class RememberIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RememberIdServlet() {
        super();
        
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rememberId = request.getParameter("rememberId");
		
		if(request.getParameter("rememberId") == null){
			rememberId = null;
		}
		
		
		
		String userId = request.getParameter("userId");
//		System.out.println(rememberId);
	
	
		
		if(rememberId==null){
			Cookie c = new Cookie("userId", userId);
			c.setMaxAge(0);
			response.addCookie(c);
		}else {
			
				Cookie c = new Cookie("userId", userId);
				c.setMaxAge(24*60*60);
				response.addCookie(c);
			
		}
		
		
		
	
		
	}

}
