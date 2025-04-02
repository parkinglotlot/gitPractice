<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%!

int[] arr = {1,3,5,4,2};
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");



String today=sdf.format(new Date());

%>

<%
pageContext.setAttribute("arr", arr);


Calendar cal = Calendar.getInstance();

sdf.parse(today);
pageContext.setAttribute("today", today);


%>
</head>
<body>

<c:set var = "인사" value = "안녕" scope = "page"></c:set>
<c:out value="${인사 }"></c:out>
<c:remove var="인사"/>
<c:out value="${인사 }"></c:out>

<c:forEach var="int" items="${arr }" varStatus="status" >
<div>${status.index }</div>
</c:forEach>

<c:forEach var= "ind" begin="1" end="10">
<c:out value="${ind }"></c:out>
</c:forEach>
<br />
<c:out value="${today}"></c:out>

</body>
</html>