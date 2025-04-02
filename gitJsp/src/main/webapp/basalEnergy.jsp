<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">

function inputIsValid(){
	let isValid = false;
	let height = document.getElementById("height").value;
	let weight = document.getElementById("weight").value;
	let age = document.getElementById("age").value;
	
	if(height <=0 || weight <=0 || age <=0 ){
		alert("입력한 값이 유효하지 않습니다.");
	}else{
		isValid = true;
	}
	
	return isValid;
	
}

</script>
</head>
<body>

<form action="BasalEnergy" method = "GET">
<div><input type="radio" name ="sex" value ="male" checked>남성
<input type="radio" name ="sex" value ="female" >여성</div>

<div>신장<input type = "text" name = "height"  id = "height">cm</div>
<div>체중<input type = "text" name = "weight"  id = "weight">kg</div>
<div>나이<input type = "text" name = "age"  id = "age">세</div>

<button onclick = "return inputIsValid();">전송</button>



</form>


</body>
</html>