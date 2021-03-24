<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int sum = (int)request.getAttribute("sum");
	String main = (String)request.getAttribute("main");
	String side = (String)request.getAttribute("side");
	String drink = (String)request.getAttribute("drink");

%>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 주문 결과</title>
<style>
#main{
	color: navy;
	font-size: 2em;
}
#side{
	color:purple;
	font-size: 1em;
}
#drink{
	color: lime;
	font-size: 0.8em;
}
#sum{
	color:maroon;
	font-size: 2em;
}


</style>
</head>
<body>
	<h1>감사합니다.</h1>
	<span id="main"><%=main %>,</span>
	<span id="side"><%=side %>,</span>
	<span id="drink"><%=drink %></span>
	<span>을/를 주문하셨습니다.</span>
	<br>
	<span>총 결제금액은</span>
	<span id="sum"> <%=sum %>원</span>
	<span> 입니다.</span>
	
</body>
</html>