<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function checkValue() {
		let isValid = false;
		let year = Number(document.getElementById("year").value);
		let month = Number(document.getElementById("month").value);
		let day =  Number(document.getElementById("day").value);
		let id = document.getElementById("id").value;
//
		let regExp = /^[A-Za-z0-9]{4,12}$/;
		if (!regExp.test(id)) {
			alert("아이디를 제대로 입력하세요.");
		} else if (year < 1000 || month > 12 || day > 31) {
			alert("날짜를 제대로 입력하세요.");
		} else {
			isValid = true;
		}
		return isValid;
	}
</script>
</head>
<body>
<form action="IdPwd" method = "POST">
<div>이름<input type="text" name = "name" id="name"></div>
<div>아이디<input type="text" name = "id" id="id"></div>
<div>비밀번호<input type="text" name = "pwd" id="pwd"></div>
<div>생년월일
<input type="text" name = "year" id="year">년
<input type="text" name = "month" id="month">월 
<input type="text" name = "day" id="day">일</div>

<input type="submit" value = "전송" onclick = "return checkValue();">
</form>
</body>
</html>