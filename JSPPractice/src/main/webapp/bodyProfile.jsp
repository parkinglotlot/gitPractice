<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="BodyProfile" method= "POST">
<h2>정보를 입력하세요</h2>
<div>나이 <input type = "number" name = "age"></div>
<div>
여자 <input type = "radio" name = "gender" value = "F" checked>
남자 <input type = "radio" name = "gender" value = "M">
</div>
<div>키 <input type = "number" name = "height" step = "0.1"></div>
<div>몸무게 <input type = "number" name = "weight" step = "0.1"></div>

<div><input type = "submit" value = "제출"></div>

</form>
</body>
</html>