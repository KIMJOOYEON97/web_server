<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int sum = (int)request.getAttribute("sum");
	String main = (String)request.getAttribute("main");
	String side = (String)request.getAttribute("side");
	String drink = (String)request.getAttribute("drink");

	System.out.println(1);
%>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 주문 결과</title>
</head>
<body>
	<h1>감사합니다.</h1>
	<p><%=main %>,<%=side %>,<%=drink %>을/를 주문하셨습니다.</p>
	<p>총 결제금액은 <%=sum %>원 입니다.</p>
</body>
</html>