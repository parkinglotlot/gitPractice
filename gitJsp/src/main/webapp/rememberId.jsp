<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% 
//값을 읽어올 수 있으면 아이디 값 고정
		Cookie[] cooks = request.getCookies();

        String loginId = "";
        String checkValue = "";
		for(Cookie c:cooks) {
			if(c.getName().equals("userId")) {
				loginId = c.getValue();
			}
			if(loginId.equals(c.getValue())){
				checkValue = "checked";
			}
		}
		
		


%>



</head>
<body>
<h1>로그인</h1>
<form action="RememberIdServlet" method = "POST">
		<div>
			아이디:
			<input type="text" name="userId" value =<%=loginId %>> 
			<input type = "checkbox" name = "rememberId" value = "Y" <%= checkValue %>>아이디 저장
		</div>
		
		<div>
			비밀번호: <input type="password" name="userPwd">
		</div>
		
			<button type="submit" >로그인</button>
	
	</form>
</body>
</html>