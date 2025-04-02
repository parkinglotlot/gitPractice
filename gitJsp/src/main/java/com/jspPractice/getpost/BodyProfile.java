package com.jspPractice.getpost;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BodyProfile")
public class BodyProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BodyProfile() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("POST 작동");
		
		Enumeration<String> params = request.getParameterNames();
		
//		System.out.println(params);
		
		List<String> valueList = new ArrayList<String>();
		
		while(params.hasMoreElements()) {
			
			String param = params.nextElement();
			
			String[] values = request.getParameterValues(param);
			
			for(String value : values) {
				valueList.add(value);
				System.out.println(param + ":" + value);
			}		
			
//			for(int i = 0; i <values.length; i++) {
//				System.out.println(param + ":" + values[i]);
//			}
		}
		System.out.println(valueList);
		
		//-------------------
		
		Map<String, String[]> profileMap = request.getParameterMap();
//		System.out.println(profileMap.toString());
		
		 Set<Entry<String, String[]>> profileSet = profileMap.entrySet();
		
		for(Entry<String, String[]> entry:profileSet) {
			String key = entry.getKey();
			String[] value = entry.getValue();
			System.out.println(key + ":" + Arrays.toString(value) );
		}
		
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		double height = Double.parseDouble((request.getParameter("height")));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double bmi = Math.round(weight/Math.pow((0.01*height), 2)*100)/100; 
		
		request.setAttribute("age", age);
		request.setAttribute("gender", gender);
		request.setAttribute("height", height);
		request.setAttribute("weight", weight);
		request.setAttribute("bmi", bmi);
		
		RequestDispatcher rd = request.getRequestDispatcher("bodyProfileOut.jsp");
		
		rd.forward(request, response);
	}

}
